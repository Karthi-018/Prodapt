
--------------------------------------22-08-2023--------------------------------


set serveroutput on;
declare
    v_fname varchar(25);
begin
    select first_name into v_fname
    from employees
    where last_name = 'Taylor';
    dbms_output.put_line(v_fname);
exception
    when too_many_rows then
    dbms_output.put_line('Use cursor');
end;



------------------------------user defined exception----------------------------

set serverOutput on;
declare 
    e_duplicate exception;
    pragma exception_init(e_duplicate,-01422);
    v_name varchar(25);
begin
    select first_name into v_name from employees
    where last_name = 'Taylor';
    dbms_output.put_line(v_name);
exception
    when e_duplicate then
    dbms_output.put_line('Insert failed');
    dbms_output.put_line(sqlcode);
end;


-----------------------------------------------------------------

set serveroutput on;
declare 
    e_dup_id exception;
    pragma EXCEPTION_init(e_dup_id,-00001);
    v_empid number := 102;
begin
    insert into employees values (102,'ABC','XYZ','xyz',5436.3445,sysdate,'IT_PROG',1000,0.3,30,100);
    dbms_output.put_line('Inserted successfully');
Exception
    when e_dup_id then
        dbms_output.put_line('Not insert');
        dbms_output.put_line(sqlcode);
end;




-------------------------------- procedure ------------------------------------


create table dept as select * from departments;
create procedure add_dept is
    v_deptid dept.department_id%type;
    v_deptname dept.department_name%type;
begin
    v_deptid := 280;
    v_deptname := 'ST_CURRI';
    insert into dept(department_id,department_name)
    values (v_deptid,v_deptname);
    dbms_output.put_line('Inserted'|| sql%rowcount||'row');
end;

begin
    add_dept;
end;


--------------------------------procedured with parameter-----------------------


create procedure add_dept_parmeter(v_deptid dept.department_id%type,
    v_deptname dept.department_name%type)is
begin
    insert into dept(department_id,department_name)
    values (v_deptid,v_deptname);
    dbms_output.put_line('Inserted'|| sql%rowcount||'row');
end;

begin
    add_dept_parmeter(320,'Trainer');
end;

--------------------------------- Function -------------------------------------

create or replace function check_sal(v_empno employees.employee_id%type ) 
return boolean is
   v_deptid employees.department_id%type;
    v_sal employees.salary%type;
    v_avgsal employees.salary%type;
begin
    select salary,department_id into v_sal,v_deptid
    from employees
    where employee_id = v_empno;
    select avg(salary) into v_avgsal from employees
    where department_id = v_deptid;
    if v_sal > v_avgsal then
        return true;
    else
        return false;
    end if;
exception
    when no_data_found then
        return null;
end;

--------------------------------------------------------------------------------


select * from job_history
where employee_id = (select employee_id 
from employees
where last_name='Abel');


update employees
set job_id='SH_CLERK',department_id=60
where last_name='Abel';


-----------------------------------trigger--------------------------------------


create or replace trigger display_salary_changes 
after delete or insert or update on employees
for each row when (new.employee_id>0)
declare
    sal_diff number;
begin
    sal_diff := :new.salary - :old.salary;
    dbms_output.put_line('Old salary: '||:old.salary);
    dbms_output.put_line('New salary: '||:new.salary);
    dbms_output.put_line('salary difference: '|| sal_diff);
end;

update employees
set salary = 16000
where last_name='Sully';

select * from employees where last_name='Abel';
--------------------------------------------------------------------------------
update employees
set job_id='SH_CLERK'
where last_name='Abel';
