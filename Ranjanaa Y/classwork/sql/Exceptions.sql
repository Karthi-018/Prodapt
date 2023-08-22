set SERVEROUTPUT ON

-- implicit exception
declare
v_lname varchar(12);
begin
select last_name into v_lname
from employees 
where last_name = 'Taylor';
dbms_output.put_line(v_lname);
exception
when too_many_rows then
dbms_output.put_line('has too many rows');
end;
/

-- explicit 
declare 
    e_exp Exception;
    PRAGMA exception_init(e_exp,-01422);
    v_lname varchar(13);
begin
    select last_name into v_lname
    from employees 
    where last_name = 'Taylor'; 
    DBMS_OUTPUT.PUT_LINE(v_lname);
EXCEPTION
when e_exp then
dbms_output.put_line('has too many rows');
DBMS_OUTPUT.PUT(sqlerrm);
end;
/

select * from employees;

-- to check duplicate
declare 
    e_exp EXCEPTION;
    PRAGMA exception_init(e_exp,-00001);
    v_eid number :=101;
begin

    insert into employees
   (employee_id, last_name, email, hire_date, job_id) 
   values(101,'Kochhar','NKOCHHAR','21-09-05','AD_VP');
EXCEPTION
when e_exp then
--dbms_output.put_line('duplicate');
DBMS_OUTPUT.PUT(sqlerrm);
end;
/   







