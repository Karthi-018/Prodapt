set serveroutput ON;
declare
v_emp_id employees.employee_id%type:=&emp_id; 
v_sal employees.salary%type:=&salary;
v_emp_id_update employees.employee_id%type;
v_sal_update employees.salary%type;
begin
update employees set salary = v_sal where employee_id= v_emp_id;
select employee_id,salary into v_emp_id_update,v_sal_update from employees where employee_id=v_emp_id;
dbms_output.put_line(v_sal_update);
dbms_output.put_line(v_emp_id_update);
end;

