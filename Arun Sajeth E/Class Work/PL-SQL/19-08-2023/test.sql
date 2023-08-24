set SERVEROUTPUT ON;
Declare
    v_last_name  varchar(25);
    v_emp_id number :=125;
begin
    select last_name into v_last_name
    from employees
    where employee_id=v_emp_id;
    DBMS_OUTPUT.PUT_LINE('The employee last name is '||v_last_name);
end;



--------------------------------------------------------------------------------



set SERVEROUTPUT ON;
declare
    v_myName varchar(20);
begin
    DBMS_OUTPUT.PUT_LINE('my name is '||v_myName);
    v_myName := 'John';
    DBMS_OUTPUT.PUT_LINE('my name is '||v_myName);
end;




-------------------------------------------------------------------------------



set SERVEROUTPUT ON;
declare
    v_event varchar(25);
begin
    v_event := q'!FATHER DAY!';
    DBMS_OUTPUT.PUT_LINE('my name is '||v_event);
end;




--------------------------------------------------------------------------------



variable v_name varchar(25);
declare
    v_employee_id number := 125;
begin
    select last_name into :v_name
    from employees
    where employee_id=v_employee_id;
    ---DBMS_OUTPUT.PUT_LINE('my name is '||v_name);
end; 
/
    print v_name;                  
    
    
    
---------------------------BIND VARIABLE----------------------------------------



variable b_emp_salary number
begin
    select salary into :b_emp_salary
    from employees where employee_id = 178;
end;
/
print b_emp_salary;




--------------------------------------------------------------------------------



---------- to print automatically --------------------
set autoprint on;
variable b_emp_salary number
begin
    select salary into :b_emp_salary
    from employees where employee_id = 178;
end;
/



----------------------------------BLOCK METHOD----------------------------------


declare
    v_length_stmt number;
    v_str varchar(25) := 'Hi hello welcome to plsql';
begin
    v_length_stmt := length(v_str);
    DBMS_OUTPUT.PUT_LINE(v_str);
    DBMS_OUTPUT.PUT_LINE(v_length_stmt);
end;
 
 
 
 ---------example month between joining date and current date for abel ---------



set SERVEROUTPUT ON;    
declare
    v_count_month number;
begin
    select MONTHS_BETWEEN(sysdate,hire_date) into v_count_month
    from employees
    where last_name = 'Abel';
    DBMS_OUTPUT.PUT_LINE(v_count_month);
end;
    
    
    
----------------------------------NESTED BLOCK----------------------------------


DECLARE
    v_father_name  varchar(25) := 'ABC';
BEGIN
    DECLARE
        v_child_name  varchar(25) := 'XYZ';
        BEGIN
            DBMS_OUTPUT.PUT_LINE(v_father_name);
            DBMS_OUTPUT.PUT_LINE(v_child_name);
        end;
    DBMS_OUTPUT.PUT_LINE(v_father_name);
END;


-----------------------------update in plsql------------------------------------
      

Declare
    v_new_salary number;
    v_last_name varchar(25);
    v_uplast_name varchar(25);
    v_upsalary number;
begin
    v_new_salary := &sal;
    v_last_name := '&name';
    update  employees
    set salary = v_new_salary
    where last_name =v_last_name;
    select last_name,salary into v_uplast_name,v_upsalary
    from employees
    where last_name=v_last_name;
    DBMS_OUTPUT.PUT_LINE(v_uplast_name);
    DBMS_OUTPUT.PUT_LINE(v_upsalary);
end;
    
select last_name,salary
from employees
where last_name='Taylor';


--------------------------------insert into plsql-------------------------------


begin
    insert into employees
    (employee_id,first_name,last_name,email,hire_date,job_id,salary)
    values (218,'Ruth','Cores','RCores',sysdate,'IT_PROG',4000);
end;


update employees
set salary=21000
where last_name='King';
