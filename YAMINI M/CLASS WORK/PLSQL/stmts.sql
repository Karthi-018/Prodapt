set serveroutput on;
DECLARE 
v_myage number := &Age;
BEGIN
IF v_myage >11
THEN
dbms_output.put_line('I am a Adult');
else 
dbms_output.put_line('I am a Child');
End IF;
End;


set serveroutput on
DECLARE 
A_grade varchar(20) := 'Excellence';
B_grade varchar(20) := 'Good';
C_grade varchar(20) := 'Average';
D_grade varchar(20) := 'Below Average';
E_grade varchar(20) := 'Fail';
Student_grade varchar(2) := upper('&grade');
BEGIN
CASE Student_grade
WHEN 'A' THEN dbms_output.put_line(A_grade);
WHEN 'B' THEN dbms_output.put_line(B_grade);
WHEN 'C' THEN dbms_output.put_line(C_grade);
WHEN 'D' THEN dbms_output.put_line(D_grade);
WHEN 'E' THEN dbms_output.put_line(E_grade);
--ELSE 'No such grade'
END CASE;
END;

select * from employees;


SELECT d.department_name,e.Manager_id,COUNT(e.manager_id),count(d.department_name)
from employees e
join departments d
on(e.department_id=d.department_id)
group by e.manager_id,d.department_name;


SELECT d.department_name,e.Manager_id,COUNT(e.employee_id),count(d.department_name)
from employees e
join departments d
on(e.department_id=d.department_id)
group by e.manager_id,d.department_name;

SELECT d.department_name,d.Manager_id,COUNT(e.manager_id),count(d.department_name)
from employees e
join departments d
on(e.department_id=d.department_id)
group by d.manager_id,d.department_id;


SELECT employee_id,first_name,last_name,department_id,job_id,salary
from employees 
where department_id between 100 and 110;


set serveroutput on;
DECLARE
Stmt_loop number := 1;
BEGIN
LOOP
dbms_output.put_line('Hi Welcome');
Stmt_loop := Stmt_loop +1;
EXIT when Stmt_loop > 10;
END LOOP;
END;

--------------------------------------------------------------------------------

set serveroutput on;
DECLARE
v_id employees.employee_id%type:= 100;
v_name employees.last_name%type;
v_dept employees.department_id%type;
v_job employees.job_id%type;
v_salary employees.salary%type;
BEGIN 
while v_id<=110 LOOP
SELECT employee_id,last_name,department_id,job_id,salary
into v_id,v_name,v_dept,v_job,v_salary from employees where employee_id=v_id;
dbms_output.put_line(v_id ||''||v_name||''||v_dept||''||v_job||''||v_salary);
v_id := v_id +1;
End loop; 
End;

--------------------------------------------------------------------

set serveroutput on;
DECLARE
Type Emp is Record
(last_name varchar(25),job_id varchar(35),salary number);
Emp_ref Emp;
Begin
select last_name,job_id,salary into Emp_ref.last_name,Emp_ref.job_id,Emp_ref.salary 
from employees
where employee_id=124;
dbms_output.put_line( Emp_ref.last_name || ' ' || Emp_ref.job_id || ' ' || Emp_ref.salary);
End;

---------------------------------------------------------------------------------

set serveroutput on;
DECLARE
Type Emp is Record
(last_name varchar(25),job_id varchar(35),salary number,
e employees%RowType);
Emp_ref Emp;
Begin
select * into Emp_ref.e 
from employees
where employee_id=124;
dbms_output.put_line( Emp_ref.e.last_name || ' ' || Emp_ref.e.job_id || ' ' || Emp_ref.e.salary);
End;
-----------------------------------------------------------------------------------------

set serveroutput on;
DECLARE
Type Emp is Record
(last_name varchar(25),job_id varchar(35),salary number,
e employees%RowType);
Emp_ref Emp;
Begin
select * into Emp_ref.e 
from employees
where employee_id=124;
select last_name,job_id,salary into Emp_ref.last_name,Emp_ref.job_id,Emp_ref.salary 
from employees
where employee_id=124;
dbms_output.put_line( Emp_ref.e.last_name || '  ' || Emp_ref.e.job_id || '  ' || Emp_ref.e.salary);
dbms_output.put_line( Emp_ref.last_name || '  ' || Emp_ref.job_id || '  ' || Emp_ref.salary);
End;
----------------------------------------------------------------------------------
create table copyemp
as (select * from employees);
delete from copyemp where employee_id=118;

-------------------------------------------------
Declare 
emp employees%RowType;
Begin
select * into emp from employees where employee_id=118;
dbms_output.put_line(emp.last_name ||' '||emp.job_id||' '||emp.salary);
insert into copyemp values emp;
end;

-----------------------------------------------------------------------

set serveroutput on;
Declare
Type Empl_Det_Type is Table of
 employees%RowType
 INDEX BY PLS_INTEGER;
 Empl_Det Empl_Det_Type;
 v_count number :=200;
 BEGIN
 while v_count<210 loop
 Select * into Empl_Det(v_count) from employees where employee_id=v_count;
 --dbms_output.put_line('Hi');
 dbms_output.put_line(Empl_Det(v_count).employee_id ||' '||Empl_Det(v_count).first_name ||' ' ||
 Empl_Det(v_count).job_id ||' ' || Empl_Det(v_count).salary);
 end loop;
 End;
 /
 
 
 -------------------------------------------------------------------------
 
 
 set SERVEROUTPUT ON;
 DECLARE 
 CURSOR emp is 
 select last_name,job_id,salary from employees
 where department_id=30;
 
 lname employees.last_name%type;
 ejob employees.job_id%type;
sal employees.salary%type;

BEGIN 
open emp;
loop
fetch emp into lname,ejob,sal;
--dbms_output.put_line(lname || '  ' || ejob || ' ' || sal);
exit when emp%NotFound;
dbms_output.put_line(lname || '  ' || ejob || ' ' || sal);
end loop;
dbms_output.put_line(lname || '  ' || ejob || ' ' || sal);
end;

---------------------------------------------------------------------------------------------

set SERVEROUTPUT ON;
 DECLARE 
 CURSOR emp_cursor is 
 select employee_id,last_name,job_id,salary from employees
 where department_id=30;
 BEGIN
 FOR emp in emp_cursor
 LOOP
 DBMS_OUTPUT.PUT_LINE(emp.employee_id||' '|| emp.last_name);
 End loop;
 End;
 /
 
 
 

 





