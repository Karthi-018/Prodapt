set serveroutput on
declare
cursor empl is
select employee_id,first_name,last_name,department_id,job_id,salary from employees ;
begin
execute immediate 'create table emp_d(
employee_id number primary key,
first_name varchar(25);
last_name varchar(25);
department_id number;
job_id varchar(25);
salary number;)';
dbms_output.put_line('Table created successfully');


exception
when others then
dbms_output.put_line('An error occurred');
for emp_r in empl
INSERT INTO emp_d VALUES (select employee_id,first_name,last_name,department_id,job_id,salary from employees);
loop
dbms_output.put_line(empl_r.employee_id||' '||empl.r.first_name||' '||empl_r.last_name||' '||empl_r.department_id||' '||empl_r.job_id||' '||empl_r.salary);
end loop;

end;