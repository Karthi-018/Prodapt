set serveroutput ON;

DECLARE
    v_age NUMBER := &age;
BEGIN
    IF v_age < 18 THEN
        dbms_output.put_line('I am a child');
    ELSE
        dbms_output.put_line('I am an adult');
    END IF;
END;
/