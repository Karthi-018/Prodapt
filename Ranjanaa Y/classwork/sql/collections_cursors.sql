set SERVEROUTPUT ON
declare
type emp_table is table of-- collections
    employees % rowtype 
    index by pls_integer;
emp emp_table; -- reference 
id number :=100;
i number :=1;
begin
while i<=10 loop
select * into emp(i) from employees
where employee_id = id;
DBMS_OUTPUT.PUT_LINE(emp(i).employee_id||emp(i).first_name||emp(i).job_id||emp(i).salary);
id:=id+1;
i:=i+1;
end loop;
end;

-- cursor
set serveroutput on;
declare
cursor cur_emp is
select employee_id,last_name from employees where department_id = 60;
v_eid employees.employee_id%type;
v_ln employees.last_name%type;
begin
open cur_emp;
loop
fetch cur_emp into v_eid,v_ln;
exit when cur_emp%notfound;
dbms_output.put_line(v_eid||v_ln);
end loop;
close cur_emp;
end;
/
-- cursor in for loop ---- so that no need open fetch..... 
set SERVEROUTPUT ON
declare
cursor cur_emp is
    select employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id from employees where department_id = 60;
    begin
        for emp_record in cur_emp
        loop
        dbms_output.put_line(emp_record.employee_id||emp_record.first_name||emp_record.last_name||emp_record.email||emp_record.phone_number||emp_record.hire_date||emp_record.job_id||emp_record.salary||emp_record.commission_pct||emp_record.manager_id||emp_record.department_id);
        end loop;
    end;
    /
        


-----------------
set SERVEROUTPUT ON
declare
begin
for er in (select employee_id,first_name,salary from employees where department_id =50)
loop
dbms_outline.put_line(er.employee_id||er.first_name||er.salary);
end loop;
end;
/

















