set serveroutput on;
Declare
Type Empl_Det_Type is Table of
 employees%RowType
 INDEX BY PLS_INTEGER;
 Empl_Det Empl_Det_Type;
 v_count number :=100;
 BEGIN
 while v_count<110 loop
 Select * into Empl_Det(v_count) from employees where employee_id=v_count;
 --dbms_output.put_line('Hi');
 dbms_output.put_line(Empl_Det(v_count).employee_id ||' '||Empl_Det(v_count).first_name ||' ' ||
 Empl_Det(v_count).job_id ||' ' || Empl_Det(v_count).salary);
 v_count:=v_count+1;
 end loop;
 End;
 /
 
 ------------------------------------------------------------------------
 
 