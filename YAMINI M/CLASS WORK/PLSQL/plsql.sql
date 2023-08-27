set SERVEROUTPUT ON;
Declare
v_last_name varchar(25);
Begin
Select last_name into v_last_name
from employees
where employee_id=100;
dbms_output.put_line('The Employees lastname : '|| v_last_name); 
End;


set SERVEROUTPUT ON;

DECLARE
    vee_last_name VARCHAR(25);
    vee_emp_id    NUMBER := 125;
BEGIN
    SELECT
        last_name
    INTO vee_last_name
    FROM
        employees
    WHERE
        employee_id = vee_emp_id;

    dbms_output.put_line('The Employees lastname : ' || vee_last_name);
END;



set SERVEROUTPUT ON;
variable v_myName varchar(20);
Declare
v_myName varchar(20);
Begin
v_myName :='Yamini';
dbms_output.put_line('My name is  : '|| v_myName);
End;
print v_myName;


VARIABLE b_emp_salary number ----Bind variables or global variables before declaration so use : to referrence it
Begin
Select salary into:b_emp_salary
From employees where employee_id=178;
End;
/
print b_emp_salary
select first_name,last_name
from employees
where salary =: b_emp_salary;


VARIABLE b_emp_salary number ----Bind variables or global variables before declaration so use : to referrence it
set autoprint on
Begin
Select salary into:b_emp_salary
From employees where employee_id=178;
End;


set SERVEROUTPUT ON;
declare 
v_months number;
Begin 
select months_between(sysdate,hire_date) into v_months 
from employees where last_name='Abel';
dbms_output.put_line('Working Month of Abel:' || round(v_months));
End;


set SERVEROUTPUT ON;
Declare
v_father_name varchar(25) := 'ABC';
Begin
Declare 
v_child_name varchar(25) := 'XYZ';
Begin
dbms_output.put_line(v_father_name);
dbms_output.put_line(v_child_name);
End;
dbms_output.put_line('The Father name is ' || v_father_name);
End;


set SERVEROUTPUT ON;
Declare 
v_last_name employees.v_last_name%type ='&name';
v_salary employees.v_salary%type ='&salary';
--v_new_last_name   
Begin
update employees
--set salary := v_salary
--where last_name := v_last_name;
select last_name,salary into v_last_name,v_salary
from employees
where last_name=v_last_name;
dbms_output.put_line(v_last_name);
dbms_output.put_line(v_salary);
End;
/


Begin
insert into employees
(employee_id,first_name,last_name,email,hire_date,job_id,salary)
values(220,'Yaminiii','MC1','xyza@gmail.com',current_date,'AD_ASST',2544);
End;
/





