-- if-else 

set serveroutput on;

DECLARE
    v_age NUMBER := &age;
BEGIN
    IF v_age <= 11 THEN
        dbms_output.put_line('Child');
    ELSE
        dbms_output.put_line('Adult');
    END IF;
END;
/

--------------------------------------------------------------------------------
--case

DECLARE
    v_grade VARCHAR(20) := upper('&grade');
BEGIN
    CASE v_grade
        WHEN 'A' THEN
            dbms_output.put_line('Excellent');
        WHEN 'B' THEN
            dbms_output.put_line('Good');
        WHEN 'C' THEN
            dbms_output.put_line('Avergae');
        WHEN 'D' THEN
            dbms_output.put_line('Below Average');
        WHEN 'E' THEN
            dbms_output.put_line('Fail');
        ELSE
            dbms_output.put_line('Invalid');
    END CASE;
END;
/

--------------------------------------------------------------------------------

SELECT
    department_id,
    employees.manager_id,
    COUNT(employee_id)
FROM
    departments
    JOIN employees USING ( department_id )
GROUP BY
    department_id,
    employees.manager_id;
--group by department_name;

--------------------------------------------------------------------------------
--basic loop

set serveroutput on;

DECLARE
    v_msg VARCHAR(10) := 'Welcome';
    v_no  NUMBER := 0;
BEGIN
    LOOP
        dbms_output.put_line(v_msg);
        v_no := v_no + 1;
        EXIT WHEN v_no > 10;
    END LOOP;
END;
/

--------------------------------------------------------------------------------
--while loop 

set serveroutput on;

DECLARE
    v_no   NUMBER := 100;
    v_id   employees.employee_id%TYPE;
    v_name employees.first_name%TYPE;
    v_dep  employees.department_id%TYPE;
    v_job  employees.job_id%TYPE;
    v_sal  employees.salary%TYPE;
BEGIN
    WHILE ( v_no <= 105 ) LOOP
        SELECT
            employee_id,
            first_name,
            department_id,
            job_id,
            salary
        INTO
            v_id,
            v_name,
            v_dep,
            v_job,
            v_sal
        FROM
            employees
        WHERE
            employee_id = v_no;

        v_no := v_no + 1;
        dbms_output.put_line(v_id
                             || v_name
                             || v_dep
                             || v_job
                             || v_sal);

    END LOOP;
END;
/

--------------------------------------------------------------------------------
