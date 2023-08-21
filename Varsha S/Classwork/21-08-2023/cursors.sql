--cursor

set serveroutput on;

DECLARE
    CURSOR emp IS
    SELECT
        last_name,
        job_id,
        salary
    FROM
        employees
    WHERE
        department_id = 30;

    lname  employees.last_name%TYPE;
    ejob   employees.job_id%TYPE;
    salary employees.salary%TYPE;
BEGIN
    OPEN emp;
    LOOP
        FETCH emp INTO
            lname,
            ejob,
            salary;
    dbms_output.put_line(lname
                         || ' '
                         || ejob
                         || ' '
                         || salary);
        EXIT WHEN emp%notfound;
    END LOOP;

END;
/

--------------------------------------------------------------------------------
--displaying the last names of all 107 employees using for loop

DECLARE
    CURSOR emp IS
    SELECT
        last_name
    FROM
        employees;

BEGIN
    FOR er IN emp LOOP
        dbms_output.put_line(er.last_name);
    END LOOP;
END;
/

--------------------------------------------------------------------------------
--displaying the last names of all 107 employees without for loop
DECLARE
    CURSOR emp IS
    SELECT
        last_name
    FROM
        employees;

    empr emp%rowtype;
BEGIN
    OPEN emp;
    LOOP
        FETCH emp INTO empr;
        EXIT WHEN emp%notfound;
        dbms_output.put_line(empr.last_name);
    END LOOP;

END;
/

--------------------------------------------------------------------------------
--displaying the id of employees in department 30 using for (for each)

DECLARE
    CURSOR c_emp_cursor IS
    SELECT
        employee_id
    FROM
        employees
    WHERE
        department_id = 30;

BEGIN
    FOR emp_rec IN c_emp_cursor LOOP
        dbms_output.put_line(emp_rec.employee_id);
    END LOOP;
END;
/

--------------------------------------------------------------------------------
--displaying the id of employees in department 30 without for 

DECLARE
    CURSOR c_emp_cursor IS
    SELECT
        employee_id
    FROM
        employees
    WHERE
        department_id = 30;

    v_emp_record c_emp_cursor%rowtype;
BEGIN
    OPEN c_emp_cursor;
    LOOP
        FETCH c_emp_cursor INTO v_emp_record;
        EXIT WHEN c_emp_cursor%notfound;
        dbms_output.put_line(v_emp_record.employee_id);
    END LOOP;

    CLOSE c_emp_cursor;
END;
/

--------------------------------------------------------------------------------
--for loop using subqueries
BEGIN
    FOR er IN (
        SELECT
            first_name
        FROM
            employees
        WHERE
            department_id = 30
    ) LOOP
        dbms_output.put_line(er.first_name);
    END LOOP;
END;
/

--------------------------------------------------------------------------------
--cursor with parameters

set verify off;

DECLARE
    CURSOR c_emp_cursor (
        deptno NUMBER
    ) IS
    SELECT
        employee_id
    FROM
        employees
    WHERE
        department_id = deptno;

    eid employees.employee_id%TYPE;
BEGIN
    OPEN c_emp_cursor(10);
    FETCH c_emp_cursor INTO eid;
    dbms_output.put_line(eid);
--exit when c_emp_cursor%notfound;
--end loop;
    CLOSE c_emp_cursor;
    
    OPEN c_emp_cursor(40);
    FETCH c_emp_cursor INTO eid;
    dbms_output.put_line(eid);
    CLOSE c_emp_cursor;
END;
/
--------------------------------------------------------------------------------
