--------------------------------CONDITIONALS------------------------------------
-----------------------------------IF ELSE--------------------------------------
set serveroutput on;
declare 
v_myage number:=&age;
begin

if(v_myage<=11)
then 
dbms_output.put_line('I am  a child');
else
dbms_output.put_line('Iam an adult');
end if;
end;
/
-----------------------------------CASE-----------------------------------------
set serveroutput on;
declare 
v_my char(1):=upper(&grade);
begin
 
case v_my
          when 'A' then dbms_output.put_line('Excellent');
          when 'B' then dbms_output.put_line('Good');
          when 'C' then dbms_output.put_line('Average');
          when 'D' then dbms_output.put_line('Below Average');
          else dbms_output.put_line('Fail');
          end case;          
end;
/
--------------------------------------------------------------------------------
select department_name,employees.manager_id,count(employees.employee_id)
from employees
join departments
using(department_id)
group by departments.department_name,manager_id;

-----------------------------------LOOPS----------------------------------------
------------------------------LOOP-DO WHILE-------------------------------------
set serveroutput on;
declare 
num number:=0;
v_msg varchar(20):='Welcome';
begin
loop
dbms_output.put_line(v_msg);
num:=num+1;
exit when num=10 ; 
end loop;
end;
----------------------------------WHILE-----------------------------------------
set serveroutput on;
declare 
num1 number(3):=101;
v_id employees.employee_id%type;
v_name employees.first_name%type;
v_did employees.department_id%type;
v_jid employees.job_id%type;
begin
while(num1<=110) loop
select employee_id ,first_name ,department_id,job_id 
into v_id,v_name,v_did,v_jid
from employees
where employee_id=num1;
dbms_output.put_line(v_id ||v_name||v_did||v_jid);
num1:=num1+1;
end loop;
end;

------------------------------RECORD-USING ROW TYPE-----------------------------
 
set serveroutput on;
declare 
type emp is record(
e employees%rowType --row type is used to store the entire row value to variable e
);
emp_ref emp;
begin 
select * into emp_ref.e from Employees where employee_id=125;
dbms_output.put_line(emp_ref.e.employee_id||' '||emp_ref.e.last_name||' '||emp_ref.e.salary);
end;

-----------------------------------RECORDS--------------------------------------
----------------------------RECORD-WITHOUT USING ROW TYPE-----------------------
set serveroutput on;
declare 
type emp is record(
lname varchar(25),
jobs varchar(20),
sal number
);
ref1 emp;
begin 
select last_name,job_id,salary into ref1.lname,ref1.jobs,ref1.sal
from employees
where employee_id=124;
dbms_output.put_line(ref1.lname||' '||ref1.jobs||' '||ref1.sal);
end;
--------------------------------------------------------------------------------
--deleting the value and inserting it again using rowType without creating reference
create table copy_emp as(select * from employees);
delete from copy_emp where employee_id=118;

declare 
emp employees%rowType;
begin
select * into emp from employees p
where employee_id=118;
insert into copy_emp
values emp;
end;

--------------------------------COLLECTIONS-------------------------------------
declare 
num1 number:=1;
type dept_table is table of
employees%rowtype 
index by pls_integer;
ref1 dept_table;
begin 
while(num1<=10) loop
select * into ref1(num1)
from employees
where employee_id=100+num1;
dbms_output.put_line(ref1(num1).employee_id||' '||ref1(num1).job_id);
num1:=num1+1;
end loop;
end;
--------------------------------------------------------------------------------
------------------------------------CURSOR--------------------------------------

set SERVEROUTPUT ON;
Declare 
CURSOR emp is select last_name,job_id,salary from employees where department_id=30;
lname employees.last_name%type;
ejob employees.job_id%type;
salary employees.salary%type;
begin
open emp;
loop
fetch emp into lname,ejob,salary;
dbms_output.put_line(lname||' '||ejob||' '||salary);
exit when emp%NOTFOUND;
end loop;
end;
-------------------------------CURSOR using for each-----------------------------
declare
cursor emp is select last_name from employees;
begin 
for i in emp
loop
dbms_output.put_line(i.last_name);
end loop;
end;
---------------------------CURSOR without using for-----------------------------
declare
cursor cur is select last_name from employees;
rec cur%rowtype;
begin
open cur;
loop
fetch cur into rec;
exit when cur%notfound;
dbms_output.put_line(rec.last_name);
end loop;
end;
-------------CREATING AND INSERTING INTO TABLE USING CURSOR---------------------
declare
cursor cur1 is select employee_id,department_id,job_id,salary from employees;
begin
execute immediate 'create table details(
employee_id number unique,
department_id number,
job_id varchar(30),
salary number
)';
for i in cur1
loop
insert into details(employee_id,department_id,job_id,salary) values (i.employee_id,i.department_id,i.job_id,i.salary);
end loop;
end;
