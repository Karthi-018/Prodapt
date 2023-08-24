set serveroutput ON;

variable b_emp_last_name varchar2(25)
set autoprint on

DECLARE
    v_emp VARCHAR2(25) := &emp`;
BEGIN
    SELECT
        last_name
    INTO :b_emp_last_name
    FROM
        employees
    WHERE
        last_name = v_emp;

END;
/