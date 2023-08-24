set serveroutput ON;
variable v_last_name varchar(25);
DECLARE
    v_last_name VARCHAR(25);
    --employee_id number:=125;
    begin
    select v_last_name into :v_last_name
    from employees
    where employee_id=100;
    end;
    /
    dbms_output.put_line('The employee name is '|| v_last_name);
    v_last_name:="ABC";
    end;
    /
print v_last_name;