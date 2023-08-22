----------------------------------------------------------------------BASIC LOOP
select d.department_name,count(employee_id),d.manager_id
from departments d
join employees e on(d.department_id=e.department_id)
group by d.department_name,d.manager_id;

set serveroutput on
declare 
--
v_wel varchar(25):='WELCOME';
v_count number:=1;
begin
loop
dbms_output.put_line(v_wel);
v_count:=v_count+1;
exit when v_count>11;
end loop;
end;
----------------------------------------------------------------------WHILE LOOP
set serveroutput on
declare 
v_eid employees.employee_id%type:=100;
v_name employees.last_name%type;
v_dep_id employees.department_id%type;
v_job_id employees.job_id%type;
v_sal employees.salary%type;
begin
while v_eid<111 loop
select employee_id,department_id,last_name,job_id,salary into v_eid,v_dep_id,v_name,v_job_id,v_sal from employees  
where employee_id=v_eid;

dbms_output.put_line(v_eid||' '||v_dep_id||'   '||v_name||'   '||v_job_id||'   '||v_sal);
v_eid:=v_eid+1;
 end loop;
end;

----------------------------------------------------------------RECORD DATA TYPE
set serveroutput on
declare
Type emp is record(
last_name varchar(25),
job_id varchar(25),
salary number,
e employees%rowtype);
e1_ref emp;
begin
select last_name,job_id,salary into e1_ref.last_name,e1_ref.job_id,e1_ref.salary from employees
where employee_id=100;
dbms_output.put_line(e1_ref.last_name||' '||e1_ref.job_id||' '||e1_ref.salary);
select * into e1_ref.e from employees where employee_id=101;
dbms_output.put_line(e1_ref.e.last_name||' '||e1_ref.e.job_id||' '||e1_ref.e.salary);

end;
------------------------------------------------------------------------ROW TYPE
set serveroutput on
declare
e employees%rowtype;
begin
select * into e from employees where employee_id=110;
dbms_output.put_line(e.last_name||' '||e.job_id);
end;
--------------------------------------------------------------------------------
CREATE TABLE COPYEMPL AS(
SELECT*FROM EMPLOYEES);
DELETE FROM COPYEMPL WHERE EMPLOYEE_ID=118;

set serveroutput on
DECLARE
e employees%rowtype;
BEGIN
select * into e from employees where employee_id=118;
INSERT INTO COPYEMPL VALUES e;

END;
-------------------------------------------------------------------------------
select*from copyempl;
-------------------------------------------------------------------------------
set serveroutput on
declare
type emp_type is table of
    employees%rowtype
    index by pls_integer;
emp emp_type;
v_count number:=1;
v_id number:=100;
begin
loop

select * into emp(v_count) from employees where employee_id=v_id;
dbms_output.put_line(emp(v_count).employee_id||' '||emp(v_count).last_name||' '||emp(v_count).job_id||' '||emp(v_count).salary);
v_count:=v_count+1;
v_id:=v_id+1;
exit when v_count>11;
end loop;
end;
--------------------------------------------------------------------------CURSOR
set serveroutput on
declare 
cursor emp is
select last_name,job_id,salary from employees where department_id=30;
v_ln employees.last_name%type;
v_jid employees.job_id%type;
v_sal employees.salary%type;
V_EMP_RECORD EMP%ROWTYPE;
begin
open emp;
loop
fetch emp into v_ln,v_jid,v_sal ;
exit when emp%notfound;
dbms_output.put_line(v_ln||' '||v_jid||' '||v_sal);
end loop;
CLOSE EMP;
end;
-----------------------------------------------------------------------------
set serveroutput on
declare
cursor emp is
select employee_id,last_name,department_id,job_id,salary from employees where department_id=30;
begin
for emp_record in emp
INSERT INTO emp VALUES (select employee_id,last_name,department_id,job_id,salary from employees);
loop
dbms_output.put_line(emp_record.employee_id||' '||emp_record.last_name||' '||emp_record.department_id||' '||emp_record.job_id||' '||emp_record.salary);
end loop;
end;
-----------------------------------------------------------------------------------------
set serveroutput on

create table Emp(
eid number;
name varchar(25);
dept_id number;
job_id varchar(25);
salary number;
);
begin
end;

