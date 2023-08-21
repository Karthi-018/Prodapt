--record method1
set serveroutput on;

DECLARE
    TYPE emp IS RECORD (
        l_name VARCHAR(20),
        job    VARCHAR(20),
        sal    NUMBER
    );
    emp_ref emp;
BEGIN
    SELECT
        last_name,
        job_id,
        salary
    INTO
        emp_ref.l_name,
        emp_ref.job,
        emp_ref.sal
    FROM
        employees
    WHERE
        employee_id = 126;

    dbms_output.put_line(emp_ref.l_name
                         || ' '
                         || emp_ref.job
                         || ' '
                         || emp_ref.sal);

END;
/

--------------------------------------------------------------------------------
--record method2 
set serveroutput on;

DECLARE
    TYPE emp IS RECORD (
        e employees%rowtype
    );
    emp_ref emp;
BEGIN
    SELECT
        *
    INTO emp_ref.e
    FROM
        employees
    WHERE
        employee_id = 130;

    dbms_output.put_line(emp_ref.e.employee_id
                         || ' '
                         || emp_ref.e.department_id);

END;
/
--------------------------------------------------------------------------------
--to display full row without creating reference error
DECLARE
    emp employees%rowtype;
BEGIN
    SELECT
        *
    INTO emp
    FROM
        employees
    WHERE
        employee_id = 101;

    dbms_output.put_line(emp.last_name
                         || ' '
                         || emp.job_id);
END;
/

--------------------------------------------------------------------------------
--deleting and inserting

set serveroutput on;

CREATE TABLE copytable
    AS
        ( SELECT
            *
        FROM
            employees
        );

DELETE FROM copytable
WHERE
    employee_id = 118;

DECLARE
    emp employees%rowtype;
BEGIN
    SELECT
        *
    INTO emp
    FROM
        employees
    WHERE
        employee_id = 118;
--insert into copytable values(emp.employee_id,...; or
    INSERT INTO copytable VALUES emp;

END;
/

--------------------------------------------------------------------------------
