set serveroutput ON;
declare
v_len_stmt number;
v_str varchar(28):='Hi Hello';
begin
v_len_stmt := length(v_str);
dbms_output.put_line(v_len_stmt);
dbms_output.put_line(v_str);
end;

