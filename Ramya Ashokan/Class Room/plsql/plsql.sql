------****pl/sql**----
set SERVEROUTPUT ON;
--ctrl fnc f7;
  variable v_last_name VARCHAR(25);
  v_last_name:='ram';
DECLARE
    --v_last_name VARCHAR(25);
    v_employee_id    NUMBER := 125;
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = v_employee_id;

    dbms_output.put_line('The employee last Name:' || v_last_name);
END;
print v_last_name;

set SERVEROUTPUT ON;
declare
v_myName varchar(20);
BEGIN
dbms_output.put_line('My name is :'||v_myName);--empty value
v_myName:='Ramya';
dbms_output.put_line('My name is :'||v_myName);
END;
--v local variable
--b bind variable
--r record
--c collection
SET AUTOPRINT ON--by using this no need of print stmt
variable b_emp_salary Number--bind varibles or global variable it should be declare outside declare (initialisation ':var_name') 
BEGIN
select salary into :b_emp_salary
from employees where employee_id=178;
END;
/--end of the block 
/*print b_emp_salary
select first_name,last_name
from employees
where salary=:b_emp_salary;*/
----monhts beetween-----
declare 
v_work_month number;
BEGIN
select months_between(sysdate,hire_date) into v_work_month
from employees where last_name='Abel';
DBMS_OUTPUT.PUT_LINE('The working month od Abel is:'||round(v_work_month));
END;
/

----nested -----
declare
v_father_name varchar(25):='abc';
BEGIN
DECLARE
v_child_name varchar(25):='xyz';
BEGIN
v_father_name:='abc_inner';
DBMS_OUTPUT.PUT_LINE('Father name is:'||v_father_name);
dbms_output.put_line('Child name is:'||v_child_name);
END;
dbms_output.put_line('father_name is'||v_father_name);
End;

--update salary of taylor from 18000
Declare
v_salary int;
--v_name varchar(45);
BEGIN
select salary into v_salary update employees set salary=18000 where last_name=(&v_name);
END;
/
--update salary
declare 
v_last_name employees.last_name%type:='&name';
v_salary employees.salary%type:='&sal';
v_new_last_name employees.last_name%type;
v_new_salary employees.salary%type;
begin
update employees
set salary=v_salary
where last_name=v_last_name;
select last_name,salary into v_new_last_name ,v_new_salary
from employees
where last_name=v_last_name;
dbms_output.put_line(v_new_last_name);
dbms_output.put_line(v_new_salary);
end;

select * from employees where last_name='Taylor';
alter table employees read write;
--update multiple col
declare 
v_last_name employees.last_name%type:='&name';
c_salary employees.salary%type:=&sal;
v_new_last_name employees.last_name%type;
c_new_salary employees.salary%type;
begin
update employees
set salary=v_salary
where last_name=v_last_name;
select last_name,salary into v_new_last_name ,c_new_salary
from employees
where last_name=v_last_name;
dbms_output.put_line(c_new_last_name);
dbms_output.put_line(v_new_salary);
end;

---emp id 218 dml in plsql
BEGIN
insert into employees
(employee_id,first_name,last_name,email,hire_date,job_id,salary)
values(218,'Ruth','Cores','RCORES',current_date,'AD_ASST',4000);
END;
/
select * from employees where employee_id=218;
update employees set salary=21000 where last_name='King';

---control structures----
declare 
v_myage number :=&number;
begin
if v_myage<11 then
 dbms_output.put_line('I am child');
else
dbms_output.put_line('I am adult');
end if;
end;
/
---case---
declare 
v_myage number :=&number;
begin
case 
 when v_myage<11 then
 dbms_output.put_line('I am child');
else
 dbms_output.put_line('I am adult');
end case;
end;
/


--grading in case---
declare
c varchar(1);
v_grade  varchar(45) :=upper('&c');

begin
case 
when v_grade='A' then
 dbms_output.put_line('Excellent');
 when v_grade='B' then
 dbms_output.put_line('good');
 when v_grade='C' then
 dbms_output.put_line('average');
 when v_grade='D' then
 dbms_output.put_line('Below average');
 when v_grade<'E' then
 dbms_output.put_line('Fail');
else
dbms_output.put_line('Enter the correct grade');
end case;
end;
/

--depid,name,countof emp---
select * from employees;
select department_id,department_name,manager_id from departments where   in (select count(*) counts from departments    natural join employees)   ;



--welcome message in loop;
declare 
--v_num number :=10;
v_i number:=0;
begin
Loop
dbms_output.put_line('Welcome');

v_i:=v_i+1;
exit when v_i=10;
end loop;
end;
/

--- fetch first ten employees details eid name dept job and salary--
declare
v_empid number;
v_empname varchar(45);
v_deptid number;
v_job_id varchar(45);
v_salary number;
v_count number:=100;
--v_count employees.employee_id=100;[if we use this no need of where condition to  ]
--v_i number:=0;
begin
 
while v_count<110 loop

select employee_id,first_name  ,department_id,job_id,salary into v_empid,v_empname,v_deptid,v_job_id,v_salary
from employees  where employee_id=v_count;
v_count:=v_count+1;
dbms_output.put_line(v_empid ||' '||v_empname||' '||v_deptid||' '||v_job_id||' '||v_salary);
--exit when v_count=110;
end loop;
end;
/



---composite data types---
----records to fetch particular col and all col with reference type ---
declare
Type emp is record
(lName varchar(25),
jobs varchar(45),
sal number,
e employees%rowtype);
emp_ref emp;
begin
select * into emp_ref.e from employees where employee_id=124;
 select last_name,job_id,salary into emp_ref.lName,emp_ref.jobs,emp_ref.sal from employees where employee_id=108;
 dbms_output.put_line('last_name'||' '||'jobs'||' '||'salary');
 dbms_output.put_line(emp_ref.lName||' '||emp_ref.jobs||' '||emp_ref.sal);
 dbms_output.put_line(emp_ref.e.last_Name||' '||emp_ref.e.job_id||' '||emp_ref.e.salary);
 ---dbms_output.put_line(emp_ref.e);can't able to print entire row using row type
 end;
 /
 
 --simple way for  entire column insert ,update select by using [only record without ref] "note :it works only for selecting entire row"---
 declare 
 emp employees%rowtype;
 begin
 select * into emp from employees where employee_id=110;
 dbms_output.put_line(emp.employee_id||' '||emp.last_name||' '||emp.salary);
 end;
 /

create table copemp
as(select * from employees);
delete from copemp where employee_id=118;
declare
--cemp copemp%rowtype;
emp employees%rowtype;
begin
select * into emp from employees where employee_id=118;
insert into copemp values emp;

end;
/
select * from copemp where employee_id=118;

-----collection--
declare
type emp_type is table of
  employees%rowtype index by pls_integer;
--v_id number:=eid employees.employee_id%type index pls_integer;
--name1 employees.first_name%type;
--jobs employees.job_id%type;
--salary employees.salary%type;
v_i number:=0;
emp emp_type;
begin


select * into emp(1) from employees 
where employee_id=10;

dbms_output.put_line(emp(1).employee_id||' '||emp(1).first_name||' '||emp(1).job_id||' '||emp(1).salary);
--end loop;
end;
/

--cursor and records using for loop--
declare 
cursor c_emp_cursor is
SELECT employee_id,last_name from  employees 
where department_id=30;
begin
for emp_record in c_emp_cursor
loop
dbms_output.put_line(emp_record.employee_id||' '||emp_record.last_name);
end loop;
end;
/

---emp_details insert emp details
/*DECLARE
    CURSOR c_emp_details1 IS
    SELECT
        employee_id,
        first_name,
        last_name,
        department_id,
        job_id,
        salary
    FROM
        employees;

BEGIN
    EXECUTE IMMEDIATE 'create table emp_details1(eid number,f_name varchar2(45),l_name varchar2(45),dept_id number,job_id varchar(45),sal number)';
    FOR emp_record IN c_emp_details1 LOOP
        INSERT INTO emp_details1 (
            eid,
            f_name,
            l_name,
            dept_id,
            job_id,
            sal
        ) VALUES (
            emp_record.employee_id,
            emp_record.first_name,
            emp_record.last_name,
            emp_record.department_id,
            emp_record.job_id,
            emp_record.salary
        );

    END LOOP;

END;
/
select * from emp_details;
rollback;
drop cursor c_emp_details;*/
---insert data--
declare
cursor c_employee_details1 is 
select employee_id,first_name,last_name,department_id,job_id,salary from employees;
begin
for emp_record in c_employee_details1 loop
insert into emp_details1(eid,f_name,l_name,dept_id,j_id,sal) 
values(emp_record.employee_id,emp_record.first_name,emp_record.last_name,emp_record.department_id,emp_record.job_id,emp_record.salary);
end loop;
end;
/
--create table--
declare
v_sql varchar2(1000);
begin
v_sql:='create table emp_details1(eid number,f_name varchar2(45),l_name varchar2(45),dept_id number,j_id varchar(45),sal number)';
execute immediate v_sql;
end;
/
select * from emp_details1;



/*exception
when others then
dbms_output.put_line(sqlerrm);
rollback;*/

---exception--
DECLARE
    v_fname VARCHAR(35);
  
BEGIN
    SELECT
        first_name
    INTO v_fname
    FROM
        employees
    WHERE
        last_name = 'Taylor';

    dbms_output.put_line('taylor first name is' || v_fname);
EXCEPTION
    WHEN too_many_rows THEN
        dbms_output.put_line('your select statement contain two many rows use cursor');
  
    
END;
/

----user defined exception---
DECLARE
    --v_eid number:=218;
    e_dup_exception EXCEPTION;
    pragma exception_init(e_dup_exception,-00001);
BEGIN

    insert into employees values (100,'steven','King'	,'SKING',	'515.123.4567',	'17-06-03',	'AD_PRES',	21000,null,null,			90);
    
EXCEPTION
    WHEN e_dup_exception THEN
        dbms_output.put_line('given employee id already exist pls provide another id');
        DBMS_OUTPUT.PUT_LINE(sqlerrm);
         DBMS_OUTPUT.PUT_LINE(sqlcode);
   
    
END;
/

----trap the error by raise----
select * from departments;
declare
v_depid departments.department_id%type:=400;
v_depname departments.department_name%type:='it';
e_invalid_depid Exception;
begin
--select department_name  into v_depname from departments where department_id=v_depid;
update departments set department_name=v_depname from departments where department_id=v_depid;
if sql%notfound then
raise e_invalid_depid;
end if;
commit;
exception
when e_invalid_depid then
dbms_output.put_line('department id invalid');
end;
/

---procedure
create table dept as select * from departments;
drop procedure add_dept;
create procedure add_dept is
v_deptid dept.department_id%type;
v_depname dept.department_name%type;
begin
v_deptid:=280;
v_depname:='ST-Curriculum';
insert into dept(department_id,department_name) values(v_deptid,v_depname);
dbms_output.put_line('Inserted '||sql%Rowcount||' row');
end;
/ 
begin 
add_dept;
end;
/
select * from dept;




---parameterised procedure---
create or replace procedure add_dept (v_deptid in dept.department_id%type,v_depname in dept.department_name%type )is

begin

insert into dept(department_id,department_name) values(v_deptid,v_depname);
dbms_output.put_line('Inserted '||sql%Rowcount||' row');
end;
/ 
begin 
add_dept(300,'hr');
add_dept(325,'developer');
end;

create function check_sal(v_empid in employees.employee_id%type) return boolean is
v_dept_id employees.department_id%type;
v_sal employees.salary%type;
v_avg_sal employees.salary%type;
begin 
select salary,department_id into v_sal,v_dept_id from employees where employee_id=v_empid;
select avg(salary) into v_avg_sal from employees where department_id=v_dept_id;
if v_sal>v_avg_sal then
return true;
else 
return false;
end if;
exception
when no_data_found then
 return null;
end;
/
begin
if(check_sal(100) is null) then
dbms_output.put_line('function return null due to exception');
elseif(check_sal(100) )then
dbms_output.put_line('salary> average');
else
dbms_output.put_line('salary<average');
end if;
end;
/
select * from employees order by last_name;
select * from job_history;
---triggers
select * from job_history where employee_id=(select employee_id from employees where last_name='Abel');

---trigger---
create or replace trigger up_emp
after update on employees
for each row 
when(new.employee_id>0)
begin
dbms_output.put_line('old depid:'||:old.department_id);
dbms_output.put_line('new depid:'||:new.department_id);
dbms_output.put_line('old job_id:'||:old.job_id);
dbms_output.put_line('new job_id:'||:new.job_id);
end;
/
update employees set department_id=60 ,job_id='IT_PROG' where last_name='Abel';

select * from employees where last_name='Abel';
----trigger----
create or replace trigger display_salary_changes
before update on employees for each row 
when(new.employee_id>0)
declare sal_diff number;
begin 
sal_diff:=:new.salary -:old.salary;
dbms_output.put_line('old.salary:'||:old.salary);
dbms_output.put_line('new salary:'||:new.salary);
dbms_output.put_line('salary difference:'|| sal_diff);
end;
/
update employees set salary=25000 where last_name='Abel';