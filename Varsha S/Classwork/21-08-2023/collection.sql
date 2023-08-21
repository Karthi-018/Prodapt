--collections 
set serveroutput on;

DECLARE
    TYPE dept_table_type IS
        TABLE OF employees%rowtype INDEX BY PLS_INTEGER;
    dept_table dept_table_type;
    v_no       NUMBER := 100;
BEGIN
    WHILE v_no <= 105 LOOP
        SELECT
            *
        INTO
            dept_table
        (v_no)
        FROM
            employees
        WHERE
            employee_id = v_no;

        dbms_output.put_line(dept_table(v_no).employee_id
                             || dept_table(v_no).first_name
                             || dept_table(v_no).job_id
                             || dept_table(v_no).salary);

        v_no := v_no + 1;
    END LOOP;
END;
