set serveroutput on;

declare
v_last_name varchar(25);
v_emp_id number:=110;

begin
select last_name into v_last_name
from employees
--where employee_id=100; 
where employee_id=v_emp_id;

dbms_output.put_line('The employee last name is:'||v_last_name);

end;

--------------------------------------------------------------------------------
set serveroutput on;
declare
v_myName varchar(20);
begin
dbms_output.put_line('my name is:'||v_myName);

v_myName :='John';
dbms_output.put_line('my name is:'||v_myName);
end;
------------------------GLOBAL VARIABLE/BIND VARIABLE---------------------------
variable b_emp_salary number
--declare
begin 
select salary into :b_emp_salary
from employees where employee_id=178;
end;
/
print b_emp_salary;
                   --auto print with binary variables--
variable b_emp_salary number
set autoprint on
--declare
begin 
select salary into :b_emp_salary
from employees where employee_id=178;
end;
/
--------------------------------------------------------------------------------
set serveroutput on;
declare
v_month_stmt number;
begin 

select round(months_between(sysdate, hire_date), 0) into v_month_stmt
from employees
--join employees on(employees.employee_id=job_history.employee_id) 
where last_name='Abel' ; 
dbms_output.put_line(v_month_stmt);
end;
------------------------------NESTED BLOCKS-------------------------------------
declare 
v_father_name varchar(25):='ABC';
begin
   declare
   v_child_name varchar(25):='XYZ';
   begin
      DBMS_OUTPUT.PUT_LINE(v_father_name);
      DBMS_output.put_line(v_child_name);
   end;
   dbms_output.put_line(v_father_name);
end;
--------------------------------------------------------------------------------
set serveroutput on;
declare
v_nam varchar(30);
v_sal_stmt number;
begin 
update employees
set salary=&v_sal_stmt
where last_name='&v_nam' ;
select salary,last_name into v_sal_stmt, v_nam from employees 
where last_name='&&v_nam' ;
dbms_output.put_line(v_sal_stmt);
dbms_output.put_line(v_nam);
end;

--------------------------------------------------------------------------------
update employees
set salary=18000
where last_name='King';
