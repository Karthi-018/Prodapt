
-------------------------------------21-08-23-----------------------------------

--------------------------------------if else ----------------------------------
set serveroutput on;
declare
    v_myage number;
begin
    v_myage := &age;
    if v_myage <18
        then
        DBMS_OUTPUT.PUT_LINE('Child');
    else
        DBMS_OUTPUT.PUT_LINE('ADULT');
    end if;
end;


--------------------------------- Case ----------------------------------------


DECLARE
    v_mygrades varchar(1);
begin
    v_mygrades := upper('&grades');
    case v_mygrades
        when  'A'
        then
            dbms_output.put_line('Excellant');
        when 'B'
        then
            dbms_output.put_line('Good');
        when 'C'
        then
            dbms_output.put_line('Average');
        when 'D'
        then
            dbms_output.put_line('Below average');
        when 'E'
        then
            dbms_output.put_line('Fail');
    end case;
end;


--------------------------------------------------------------------------------

select d.manager_id,d.department_id,count(e.employee_id)
from employees e
join departments d
on(d.department_id=e.department_id)
group by d.manager_id,d.department_id;


-------------------------------basic loop---------------------------------------


declare
    v_count number :=0;
begin
    loop
        dbms_output.put_line('WELCOME');
        v_count:=v_count+1;
        exit when(v_count>10);
    end loop;
end;


------------------------------------while loop----------------------------------


declare 
    v_emp_id number :=100 ;
    v_emp_name varchar(25);
    v_dept_id number;
    v_jobid varchar(25);
    v_sal number;
begin
    while v_emp_id<110 loop
        select last_name,department_id,job_id,salary
        into v_emp_name,v_dept_id,v_jobid,v_sal
        from employees where employee_id=v_emp_id;
        dbms_output.put_line(v_emp_id||' '||v_emp_name||' '||v_dept_id||' '||v_jobid||' '||v_sal);
        v_emp_id := v_emp_id+1;
    end loop;
end;
   
   
---------------------------------records----------------------------------------

declare
    type emp is record
    ( lname varchar(25),
        job varchar(25),
        sal number,
        e employees%rowtype
    );
    emp_ref emp;
begin
    select * into emp_ref.e from employees where employee_id = 124;
    select last_name,job_id,salary
    into emp_ref.lname,emp_ref.job,emp_ref.sal
    from employees
    where employee_id = 124;
    dbms_output.put_line(emp_ref.lname||' '||emp_ref.job||' '||emp_ref.sal);
    dbms_output.put_line(emp_ref.e.employee_id||' '||emp_ref.e.department_id);
end;



declare
    employee employees%rowtype;
begin
    select * into employee
    from employees
    where employee_id = 124;
    dbms_output.put_line(employee.employee_id||' '||employee.department_id
    ||' '||employee.first_name);
end;
/

--------------------------------------------------------------------------------
create table copy_emp
as
(select * from employees);

delete from copy_emp where employee_id = 118;

declare 
    employee employees%rowtype;
begin
    select * into employee
    from employees
    where employee_id = 118;
    insert into copy_emp values employee;
end;

select * from copy_emp where employee_id = 118;


----------------------------------------collections ----------------------------


declare
    type emptable is table of
        employees%rowtype index by PLS_INTEGER;
    emp emptable;
    v_id number := &id;
    i number :=0;
begin
    while v_id<110 loop
        select * into emp(i) from employees where employee_id = v_id;
        v_id:=v_id+1;
        i:=i+1;
    end loop;
    for j in emp.first.. emp.last
        loop
            dbms_output.put_line(emp(j).employee_id||' '||emp(j).first_name||' '||emp(j).job_id||' '||emp(j).salary);
        end loop;
END;



---------------------------------------Cursor-----------------------------------


DECLARE
    CURSOR c_emp IS
    SELECT last_name,job_id
    FROM employees;
    v_name employees.last_name%TYPE;
    v_job  employees.last_name%TYPE;
BEGIN
    OPEN c_emp;
    LOOP
        FETCH c_emp INTO v_name, v_job;
        EXIT WHEN c_emp%notfound;
        dbms_output.put_line(v_name || ' ' || v_job);
    END LOOP;
    close c_emp;
END;
/

--------------------------------------------------------------------------------


declare
    cursor emp_cursor is
    select employee_id,last_name from employees
    where department_id=30;
begin
    for emp_record in emp_cursor
    loop
        dbms_output.put_line(emp_record.employee_id||' '||emp_record.last_name);
    end loop;
end;
