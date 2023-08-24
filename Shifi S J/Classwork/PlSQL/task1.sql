set serveroutput ON;

DECLARE
    v_name NUMBER := 1;
BEGIN
    LOOP
        dbms_output.put_line('Welcome');
        v_name := v_name + 1;
        EXIT WHEN ( v_name > 10 );
    END LOOP;
END;
