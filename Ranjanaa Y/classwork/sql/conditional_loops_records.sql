-- if else
set SERVEROUTPUT on
declare
v_age number(10) := &age;
begin
    if v_age < 18
        THEN
            dbms_output.put_line('child');
        else
            dbms_output.put_line('adult');
        end if;
    end;
    /
    
 -- case
    
declare
v_grade varchar(10) := upper('&grade');
begin
    case v_grade 
        when 'A' then
        dbms_output.put_line('Excellent');
        when 'B' then
        dbms_output.put_line('Good');
        when 'C' then
        dbms_output.put_line('Average');
        when 'D' then
        dbms_output.put_line('Below average');
        when 'E' then
        dbms_output.put_line('Fail');
        else
        dbms_output.put_line('Invalid');
        end case;
    end;
    /
    
-- to check how many employees are working in each department  
select d.department_name,d.manager_id,count(e.employee_id)
from employees e
join departments d
on(e.department_id=d.department_id)
group by d.department_name,d.manager_id;

select department_name,manager_id
from departments;

select department_id,count(employee_id)
from employees
group by department_id;

-- to print welcome 10 times (using basic loop)

set SERVEROUTPUT ON
declare
    x number := 1;
begin
    LOOP
    DBMS_OUTPUT.PUT_LINE ('welcome' );
    x:=x+1;
    exit when x>10 ;
     END LOOP;
end;
/

declare 
v_id number(10);
v_FN varchar(10);
v_LN varchar(10);
v_did number(10);
v_jid varchar(10);
v_sal number(10);
x number := 100;
count1 number := 1;
begin
while count1<=10 loop
select employee_id,first_name,last_name,department_id,job_id 
into v_id,v_FN,v_LN,v_did,v_jid from  employees
where employee_id = x;
DBMS_OUTPUT.PUT_LINE(v_id||v_FN||v_LN||v_did||v_sal);
x :=x+1;
count1 :=count1+1;
end loop;
end;
/

----- creating record type with reference
declare
type emp is record
(v_ln varchar(25),
v_jid varchar(25),
v_sal number);
er emp;
begin
select last_name,job_id,salary
into er.v_ln,er.v_jid,er.v_sal
from employees
where employee_id = 124;
DBMS_OUTPUT.put_line(er.v_ln||er.v_jid||er.v_sal);
end;
/

-- creating rowtype to select all columns
set SERVEROUTPUT on
declare
type emp is record
(e employees%rowtype);
er emp;
begin
    SELECT * into er.e from employees where employee_id = 125;
    DBMS_OUTPUT.put_line(er.e.employee_id||er.e.first_name);
end;
/

--or 
declare
e employees%rowtype;
begin
select * into e
from employees
where employee_id = 124;
dbms_output.put_line(e.employee_id);
end;
/


--- copying a table
create table copyemp as select * from employees;
delete from copyemp where employee_id = 118;
 
--select * from copyemp;
declare 
e employees%rowtype;
begin
select * into e
from employees
where employee_id = 118;
--insert into copyemp values(e.employee_id,e.first_name,e.last_name,e.email,e.phone_number,e.hire_date,e.job_id,e.salary,e.commission_pct,e.manager_id,e.department_id);
insert into copyemp values e;

end;
/

select * from copyemp;







