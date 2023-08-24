set serveroutput ON;
declare
v_last_name employees.last_name%type:='&name'; 
v_sal employees.salary%type:=&salary;
v_last_name_update employees.last_name%type;
v_sal_update employees.salary%type;
begin
update employees set salary = v_sal where last_name= v_last_name;
select last_name,salary into v_last_name_update,v_sal_update from employees where last_name=v_last_name;
dbms_output.put_line(v_sal_update);
dbms_output.put_line(v_last_name_update);
end;
/


























