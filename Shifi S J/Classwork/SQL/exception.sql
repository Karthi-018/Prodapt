set serveroutput ON;

declare
v_lname varchar(20);
begin
select last_name into v_lname
from employees
where last_name='Taylor';
dbms_output.put_line('john last name is '||v_lname);
exception
when too_many_rows 
then dbms_output.put_line('selectin more rows');
end;