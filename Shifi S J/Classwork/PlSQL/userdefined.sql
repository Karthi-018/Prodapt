set serveroutput ON;
declare
e_duplicate_excep exception;
pragma exception_init(e_duplicate_excep,-01422);
v_name varchar(10);
begin 
select first_name into v_name from employees where last_name='Taylor';
dbms_output.put_line(v_name);
exception
when e_duplicate_excep then 
dbms_output.put_line('too many rows');
dbms_output.put_line(SQLCODE);
dbms_output.put_line(SQLERRM);

end;

