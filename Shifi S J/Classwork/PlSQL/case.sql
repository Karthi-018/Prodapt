set serveroutput ON;

DECLARE
    v_grade VARCHAR2(10) := upper('&grade');
BEGIN
    CASE v_grade 
--varchar2(2) := '&grade'
        WHEN 'A' THEN
            dbms_output.put_line('Excellent');
        WHEN 'B' THEN
            dbms_output.put_line('Good');
        WHEN 'C' THEN
            dbms_output.put_line('Average');
        WHEN 'D' THEN
            dbms_output.put_line('Below average');
        WHEN 'E' THEN
            dbms_output.put_line('Fail');
    END CASE;
END;