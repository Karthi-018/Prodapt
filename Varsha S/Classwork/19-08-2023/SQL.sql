--pl/sql

set serveroutput on;

DECLARE
    v_last_name VARCHAR(20);
    v_emp_id    NUMBER := 120;
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = v_emp_id;

    dbms_output.put_line('The employee'
                         || q'['s]'
                         || ' last name is '
                         || v_last_name);
END;

-----------------------------------------------------------------------------
set serveroutput on;

DECLARE
    v_l_name VARCHAR(20);
BEGIN
    dbms_output.put_line('My name is : ' || v_l_name);
END;

-----------------------------------------------------------------------------
set serveroutput on;

DECLARE
    v_event VARCHAR(20);
BEGIN
    v_event := 'Father' || q'[s]' ||' day';   
    dbms_output.put_line('Tomorrow is ' || v_event);
    v_event := q'[Mothers day]';
    dbms_output.put_line('Tomorrow is ' || v_event);
END;

----------------------------------------------------------------------------
--this will throw an error because variable name and column name is same
set serveroutput on;

DECLARE
    v_last_name VARCHAR(20);
    employee_id    NUMBER := 120;
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = employee_id;

    dbms_output.put_line('The employee'
                         || q'['s]'
                         || ' last name is '
                         || v_last_name);
END;

----------------------------------------------------------------------------
--error

set serveroutput on;
variable v_last_name VARCHAR(20)

DECLARE
    v_emp_id
number := 120;

BEGIN
    SELECT
        last_name
    INTO: v_last_name
    FROM
        employees
    WHERE
        employee_id = v_emp_id;

--print v_last_name;
END;
/
print v_last_name;

---------------------------------------------------------------------------
--bind variable

variable b_emp_salary number

BEGIN
    SELECT
        salary
    INTO :b_emp_salary
    FROM
        employees
    WHERE
        employee_id = 178;

END;
/

print b_emp_salary

SELECT
    first_name,
    last_name
FROM
    employees
WHERE
    salary = :b_emp_salary;

--------------------------------------------------------------------------

declare
v_len_stmnt number;
v_str varchar(20) :=  'Varsha';
begin 
v_len_stmnt := length(v_str);
dbms_output.put_line(v_len_stmnt);
end;


--------------------------------------------------------------------------
--to display the no.of months Abel has worked 

set serveroutput on;

DECLARE
    v_months number;
BEGIN
SELECT
    trunc(MONTHS_BETWEEN(SYSDATE,hire_date),0)
    INTO v_months
    FROM
        employees
    WHERE
        last_name = 'Abel';

    dbms_output.put_line('No. of months is ' || v_months);
END;

---------------------------------------------------------------------------
--nested block

set serveroutput on;

DECLARE --father
    v_father_name VARCHAR(20) := 'abc';
BEGIN --father
    DECLARE --child
        v_child_name VARCHAR(20) := 'xyz';
    BEGIN --child
        dbms_output.put_line(v_father_name);
        dbms_output.put_line(v_child_name);
    END; --child

    dbms_output.put_line(v_father_name);
END; --father

---------------------------------------------------------------------------
--change the salary of Abel to 18000 (get the name and salary from user)
set serveroutput on;

DECLARE
    v_salary        employees.salary%TYPE := &sal;
    v_last_name     employees.last_name%TYPE := &name;
    v_new_salary    employees.salary%TYPE;
    v_new_last_name employees.last_name%TYPE;
BEGIN
    UPDATE employees
    SET
        salary = v_salary
    WHERE
        last_name = v_last_name;

    SELECT
        salary,
        last_name
    INTO
        v_new_salary,
        v_new_last_name
    FROM
        employees
    WHERE
        last_name = v_last_name;

    dbms_output.put_line('Updated salary of '
                         || v_new_last_name
                         || ' is '
                         || v_new_salary);
END;

-----------------------------------------------------------------------------

set serveroutput on;

BEGIN
    INSERT INTO employees (
        employee_id,
        first_name,
        last_name,
        email,
        hire_date,
        job_id,
        salary
    ) VALUES (
        employees_seq.NEXTVAL,
        'Ruth',
        'Cores',
        'RCORES',
        current_date,
        'AD_ASST',
        4000
    );

END;
/

select * from employees;

----------------------------------------------------------------------------
