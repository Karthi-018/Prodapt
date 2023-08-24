--------------SCALER VARIABLE----------------------
DECLARE
    v_last_name VARCHAR(25);
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = 100;

END;
---------------------------------------------------------
set SERVEROUT on;

DECLARE
    v_last_name VARCHAR(25);
    v_emp_id    NUMBER := 125;
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = v_emp_id;

    dbms_output.put_line('The employee last name is:' || v_last_name);
END;
-----------------------------------------
declare 
    v_myName varchar2(20);
begin
    --dbms_output.put_line('My name: '|| v_myName);
    v_myName := 'Sandra';
    dbms_output.put_line('My name is: '|| v_myName);
end;

-----------------------------------------------------------------
set SERVEROUT on;
 variable  b_last_name VARCHAR(25);
DECLARE  
    v_employee_id    NUMBER := 125;
BEGIN
    SELECT
        last_name
    INTO :b_last_name
    FROM
        employees
    WHERE
        employee_id = b_employee_id;
        dbms_output.put_line('The employee last name is:' || b_last_name);  
END;
/
print b_last_name;   --we can not use this var outside the block so error

------------------------------------------------------------------------------
variable b_emp_salary number
begin 
    select salary into :b_emp_salary
    from employees where employee_id = 178;
end;
/
print b_emp_salary
select first_name,last_name
from employees
where salary =: b_emp_salary;
------------------------------------------------
set SERVEROUT on;
 
set autoprint on
DECLARE  
    v_employee_id    NUMBER := 125;
    v_last_name VARCHAR(25);
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = v_employee_id;
        dbms_output.put_line('The employee last name is:' || v_last_name);  
END;
/
--print v_last_name;
----------------------------------------------------
declare 
    v_length_month number;
begin 
    select months_between(sysdate,hire_date)
    into v_length_month
    from employees
    where last_name='Abel';
    dbms_output.put_line('The working months of Abel is:' || round(v_length_month));
end;
 /
 
 ---------------------------------------------------------------------
 set SERVEROUT on;
 declare
 v_father_Name varchar(25) := 'ABC';
 begin
      declare
        v_child_Name varchar(25) := 'xyz';
      begin
           dbms_output.put_line(v_father_Name);
           dbms_output.put_line(v_child_Name);
      end;
    dbms_output.put_line(v_child_Name);
end;
------------------------------------------------------
declare
    v_new_salary number:= &sal;
begin
    update employees 
    set salary= v_new_salary 
    where last_name = 'Taylor';
    dbms_output.put_line('Updated salary of ' ||last_name ||'is'||v_new_salary);
end;
----------------------------------------------------------
declare
    v_new_salary number:= &sal;
    v_emp_name varchar(50):=&name;
begin
    update employees 
    set salary= v_new_salary;
    select last_name
            into v_emp_name
            from employees
            where last_name=v_emp_name;
    dbms_output.put_line('Updated salary of ' ||v_emp_name||' is '||v_new_salary);
end;
/
-----------------------------------------------------------------------------

select * from employees;
rollback;
select * from copyEmp;
--------------------------------------------------
declare
    v_name varchar(40);
begin
    select last_name into v_name
    from employees
    where first_name='John';
    dbms_output.put_line('John last name is' ||v_name);
exception
    when too_many_rows then
    dbms_output.put_line('Your select statemnet retrieved multiple rows. consider using a cursor');
end;
-----------------------------------------------------------------
declare
    no_data_found exception;
    pragma exception_init(no_data_found, -00701);
begin 
    select last_name from employees
    where first_name = 'King';
exception
    when no_data_found then
    dbms_output.put_line('no data found');
    dbms_output.put_line(sqlerrm);
end;
-----------------------------------------------------------------
declare
    e_name_exists exception;
    pragma exception_init(e_name_exists, -01400);
begin 
    insert into employees (employee_id,last_name) values (100,'Abel');
exception
    when e_name_exists then
    dbms_output.put_line('Already exists');
    dbms_output.put_line(sqlerrm);
end;


insert into employees (employee_id,last_name) values(100,'Abel');
---------------------PROCEDURE---------------------------------------------------
create table dept2 as select * from departments;
create procedure insert_dept is
    v_dept_id dept.department_id%type;
    v_dept_name dept.department_name%type;
begin
    v_dept_id :=280;
    v_dept_name := 'ST-Curriculam';
    insert into dept2(department_id,department_name)
        values(v_dept_id,v_dept_name);
        dbms_output.put_line('Inserted'|| sql%rowcount ||'row');
end;
/
begin
    insert_dept();                          --calling the procedure
end;
/
select * from dept2;

---------------------------PARAMETARIZED PROCEDURE------------------------------
create table dept as select * from departments;
create procedure add_dept(v_dept_id number, v_dept_name varchar) is
begin
    insert into dept(department_id,department_name)
        values(v_dept_id,v_dept_name);
        dbms_output.put_line('Inserted'|| sql%rowcount ||'row');
end;
/
begin
    add_dept(290 ,'HR');
end;
/
select * from dept;
drop PROCEDURE add_dept;
--------------------------FUNCTION----------------------------------------------
CREATE FUNCTION check_sal RETURN BOOLEAN IS

    v_dept_id employees.department_id%TYPE;
    v_empno   employees.employee_id%TYPE;
    v_sal     employees.salary%TYPE;
    v_avg_sal employees.salary%TYPE;
BEGIN
    v_empno := 205;
    SELECT
        salary,
        department_id
    INTO
        v_sal,
        v_dept_id
    FROM
        employees
    WHERE
        employee_id = v_empno;

    SELECT
        AVG(salary)
    INTO v_avg_sal
    FROM
        employees
    WHERE
        department_id = v_dept_id;

    IF v_sal > v_avg_sal THEN
        RETURN true;
    ELSE
        RETURN false;
    END IF;
EXCEPTION
    WHEN no_data_found THEN
        RETURN NULL;
END;
---------------------------------PARAMETERIZED FUNCTION-------------------------
CREATE FUNCTION check_sal(p_empno employees.employee_id%TYPE) RETURN BOOLEAN IS

    v_dept_id employees.department_id%TYPE;
    v_sal     employees.salary%TYPE;
    v_avg_sal employees.salary%TYPE;
BEGIN
    v_empno := 205;
    SELECT
        salary,
        department_id
    INTO
        v_sal,
        v_dept_id
    FROM
        employees
    WHERE
        employee_id = v_empno;

    SELECT
        AVG(salary)
    INTO v_avg_sal
    FROM
        employees
    WHERE
        department_id = v_dept_id;

    IF v_sal > v_avg_sal THEN
        RETURN true;
    ELSE
        RETURN false;
    END IF;
EXCEPTION
    WHEN no_data_found THEN
        RETURN NULL;
END;
    
--------------------------------TRIGGER-----------------------------------------
select * from job_history where job_id = (select job_id from employees where last_name='Abel');

update employees set job_id='IT_PROG',department_id = 60 where employee_id=174;
select * from employees;
desc job_history;
--------------------------------------------------------------------------------
CREATE OR REPLACE TRIGGER display_salary_changes BEFORE
    DELETE OR INSERT OR UPDATE ON employees
    FOR EACH ROW
    WHEN ( new.employee_id > 0 )
DECLARE
    sal_diff NUMBER;
BEGIN
    sal_diff := :new.salary - :old.salary;
    dbms_output.put_line('Old salary: ' || :old.salary);
    dbms_output.put_line('New salary: ' || :new.salary);
    dbms_output.put_line('Salary difference: ' || sal_diff);
END;

desc employees;

