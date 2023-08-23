----------------------------EXCEPTION HANDLING----------------------------------
--------------------------------EXCEPTION---------------------------------------
set serveroutput on;
declare 
v_lname varchar(20);
begin
select last_name into v_lname 
from employees
where last_name='Taylor';
dbms_output.put_line(v_lname);
exception
when too_many_rows then 
dbms_output.put_line('Your select statement retrived multiple rows.');
end;
------------------------------USER DEFINED EXCEPTION----------------------------
set serveroutput on;
declare 
v_lname varchar(20);
e_excp exception;
pragma exception_init(e_excp,-01422);
begin 
select last_name into v_lname 
from employees
where last_name='Taylor';
exception
when e_excp then
dbms_output.put_line('Your select statement retrived multiple rows.');
end;

------------------------------THROWING EXCEPTION EXPLICITLY---------------------
set serveroutput on;
declare 
v_num number:=&num;
e_excp exception;
pragma exception_init(e_excp,-00001);
begin 
--insert into employees(employee_id)values(v_num);
INSERT INTO employees (
        employee_id,
        last_name,
        email,
        hire_date,
        job_id
    ) VALUES (
        v_num,
        'abc',
        'vch',
        '22-08-23',
        'MANAGER'
    );
if(v_num>100 and v_num<=206) then
raise e_excp ;
end if;
exception
when e_excp then
dbms_output.put_line('You have inserted duplicate value');
end;

----------------------------------PROCEDURES-----------------------------------
------------------------------PROCEDURE WITHOUT PARAMETER-----------------------
drop table dep;
create table dep as select * from departments;
select * from dep;

create or replace procedure add1_dept is
v_did dep.department_id%type;
v_dname dep.department_name%type;
begin 
v_did:=290;
v_dname:='St1-Curriculum';
insert into dep(department_id,department_name) values(v_did,v_dname);
dbms_output.put_line('Inserted');
end;
--calling the procedure using anonymous block
begin
add1_dept;
end;
-----------------------------PROCEDURE WITH PARAMETERS--------------------------
create table trainee as select employee_id,first_name from employees;

create or replace procedure add_trainee(v_id employees.employee_id%type,v_name employees.first_name%type) is
begin 

insert into trainee(employee_id,first_name) values(v_id,v_name);
dbms_output.put_line('Inserted');
end;
--calling the procedure using anonymous block
begin 
add_trainee(290,'Alin');
end;
---------------------------------FUNCTIONS--------------------------------------
create function check_sal return boolean is
v_id employees.department_id%type;
v_eno employees.employee_id%type;
v_sal employees.salary%type;
v_avsal employees.salary%type;
begin
v_eno:=205;
select salary,department_id into v_sal,v_id
from employees
where employee_id=v_eno;
select avg(salary) into v_avsal from employees 
where department_id=v_id;
if v_sal > v_avsal then 
return true;
else
return false;
end if;
exception 
when no_data_found then
return null;
end;

begin 
if(check_sal is null) then
dbms_output.put_line('The function returned is null');
elsif (check_sal) then
dbms_output.put_line('Salary>average');
else
dbms_output.put_line('Salary<average');
end if;
end;
--------------------------------FUNCTION WITH PARAMETER-------------------------

create or replace function check_sal(v_empno employees.employee_id%type) return boolean is
v_deptid employees.department_id%type;
v_sal employees.salary%type;
v_avgsal employees.salary%type;
begin
select salary,department_id into v_sal,v_deptid from employees
where employee_id=v_empno;
select avg(salary) into v_avgsal from employees where department_id=v_deptid;
if v_sal>v_avgsal then
return true;
else 
return false;
end if;
exception
when no_data_found then
return null;
end;

begin
if (check_sal(205) is null) then
dbms_output.put_line('function returned null due to exception');
elsif (check_sal(205)) then
dbms_output.put_line('salary>average');
else
dbms_output.put_line('salary<average');
end if;
end;
--------------------------------------------------------------------------------

---------------------------------TRIGGERS--WITH BEFORE--------------------------

create or replace trigger
display_salary_changes before 
delete or insert or update on employees for each row
when(new.employee_id>0) declare
sal_diff number;
begin sal_diff := :new.salary - :old.salary;
dbms_output.put_line('OLD SALARY'|| :old.salary);
dbms_output.put_line('NEW SALARY'||:new.salary);
dbms_output.put_line('SALARY diff'||sal_diff);
end;

update employees set salary=25000
where last_name='Abel';
----------------------------TRIGGERS WITH AFTRER--------------------------------
create or replace trigger
display_salary_changes after --after 
delete or insert or update on employees for each row
when(new.employee_id>0) declare
sal_diff number;
begin sal_diff := :new.salary - :old.salary;
dbms_output.put_line('OLD SALARY'|| :old.salary);
dbms_output.put_line('NEW SALARY'||:new.salary);
dbms_output.put_line('SALARY diff'||sal_diff);
end;

update employees set salary=25000
where last_name='Abel';
