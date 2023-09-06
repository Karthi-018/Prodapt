set serveroutput ON;

DECLARE
    v_eid    employees.employee_id%TYPE := 100;
    v_ename  employees.last_name%TYPE;
    v_edept  employees.department_id%TYPE;
    v_ejobid employees.job_id%TYPE;
    v_esal   employees.salary%TYPE;
BEGIN
    WHILE v_eid <= 110 LOOP
        SELECT
            last_name,
            department_id,
            job_id,
            salary
        INTO
            v_ename,
            v_edept,
            v_ejobid,
            v_esal
        FROM
            employees
        WHERE
            employee_id = v_eid;

        dbms_output.put_line(v_eid
                             || ' '
                             || v_ename
                             || ' '
                             || v_edept
                             || ' '
                             || v_ejobid
                             || ' '
                             || v_esal);

        v_eid := v_eid + 1;
    END LOOP;
END;