
 --------------------------------- Union ---------------------------------------
 select employee_id,job_id
 from employees
 union
 select employee_id,job_id
 from job_history;
 ------ It will print unique values in both query(set)
 ------ it will print current job_id
 
 
 ----------------------------------- union all ---------------------------------
 select employee_id,job_id
 from employees
 union all
 select employee_id,job_id
 from job_history
 order by employee_id;
 ----It will print duplicate values and unique values also
 -----ie it will print previous job_id and current job_id also
 
 
 
 --------------------------- Intersection --------------------------------------
 select employee_id,department_id
 from employees
 INTERSECT
 select employee_id,department_id
 from job_history
 order by employee_id;
 
 ---------- it will print common of both tables
 
 
 ---------------------------------- Minus --------------------------------------
 select employee_id,department_id
 from employees
 MINUS
 select employee_id,department_id
 from job_history
 order by employee_id;
 
 ------- it will print uique employee_id that are present in job_history tables
 
 ------------------------------------------------------------------------------
 
 select employee_id,department_id,salary
 from employees
 union
 select employee_id,department_id,0
 from job_history
 order by employee_id;
 
 ------------------------------------------------------------------------------
 

select employee_id, job_id

from employees

union---no duplicate value

----union all gives duplicate value

select employee_id,job_id

from JoB_history

order by Employee_id;

-----------------------intersect

select job_id,employee_id, department_id

from employees

intersect

select job_id,employee_id,department_id

from JoB_history

order by Employee_id;

-------------------minus

select job_id,employee_id, department_id

from employees

minus

select job_id,employee_id,department_id

from JoB_history

order by Employee_id;

-------------

select employee_id,department_id,job_id,salary

from employees

union

select employee_id,department_id,job_id,0

from JOB_history

order by employee_id;

select * from employees;

--------------------------------------------------------------------------------

create table hire_dates

(id number(8),hire_date DATE DEFAULT SYSDATE);

insert into hire_dates values(1,'15-09-2001');

insert into hire_dates(id) values(2);

select * from hire_dates;

 

create table hire_dates1

(id number(8),hire_date DATE);

insert into hire_dates1 values(1,'15-09-2001');

insert into hire_dates1(id) values(2);

insert into hire_dates1(hire_dates1) values(12346);

delete from employees where employee_id=200;

select * from hire_dates1;

 

alter table employees read only;

update employees set salary=1000

where last_name='Abel';

alter table employees read WRITE;

-----------------------------example of simple view-----------------------------

create view empvu80

as select employee_id,last_name,salary

from employees

where department_id=80;

insert into empvu80(employee_id,last_name,salary) values(208,'dimple',10000);

describe empvu80;

delete from empvu80 where salary=80;

select * from empvu80;

--drop view empvu80;

---------------------------example of complex view------------------------------

create or replace view dept_sum_vu(name,minsal,maxsal,avgsal)

as select d.department_name, MIN(e.salary),Max(e.salary),avg(e.salary)

from employees e join departments d

on(e.department_id=d.department_id)

group by d.department_name;

select * from dept_sum_vu;

---------------------- TO RECOVER THE TABLE OR VIEW-----------------------------

drop table job_grades;

select* from job_grades;

flashback table hr.job_grades to before drop;

------------------------SEQUENCE------------------------------------------------

CREATE SEQUENCE dept_deptid_seq

    increment by 10

    start with 120

    maxvalue 999

    nocache

    nocycle;

insert into departments values(dept_deptid_seq.nextval,'Training',null,null);

drop sequence dept_deptid_seq;

CREATE SEQUENCE dept_deptid_seq

    increment by 10

    start with 300

    nocache

    nocycle;

    insert into departments values(dept_deptid_seq.nextval,'Developer',null,null);

        insert into departments values(dept_deptid_seq.nextval,'Tester',null,null);


    select dept_deptid_seq.nextVal,dept_deptid_seq.currval from dual;


