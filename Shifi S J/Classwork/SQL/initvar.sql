set serveroutput ON;

declare
v_myName varchar2(20);
begin
    dbms_output.put_line('My name is: '|| v_myName);
    v_myName:='John';
    dbms_output.put_line('My name is: '|| v_myName);
end;




set serveroutput ON;
declare 
v_myName varchar2(20) := 'John';
begin
v_myName:='Stephen';
    dbms_output.put_line('My name is: '|| v_myName);
end;