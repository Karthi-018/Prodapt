set serveroutput ON;

DECLARE
    v_last_name VARCHAR(25);
--constant v_emp_id number :=100;
BEGIN
    SELECT
        last_name
    INTO v_last_name
    FROM
        employees
    WHERE
        employee_id = 100; --100 can be given with variable name v_emp_id 
    dbms_output.put_line('The employee lastname :' || v_last_name);
END;