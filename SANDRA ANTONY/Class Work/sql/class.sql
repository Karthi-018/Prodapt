desc employees;

select employee_id, last_name,salary,
case JOB_ID 
when 'IT_PROG' then salary*5+salary
when 'SA_REP' then salary*0.5+salary
when 'IT_MAG' then salary*0.8+salary
else salary
end salary
from employees;

select employee_id, last_name,salary,
DECODE(JOB_ID,'IT PROG' ,salary*5+salary
            ,'SA-REP' ,salary*0.5+salary
            ,'IT-MAG' ,salary*0.8+salary
,salary) using_decode_sal
from employees;

select count(*)
from employees;

select sum(salary)/count(*)
from employees;

select sum(salary) total_salary,round(avg(salary),2) avg_salary,max(hire_date) max_salary,min(hire_date) min_salary
from employees;

select count(salary)
from employees;

select round(sum(salary)/count(*),2),
round(sum(salary)/count(manager_id),2),
round(sum(salary)/count(nvl(manager_id,0)),2),
round(avg(salary),2)
from employees;

select count(department_id)
from departments;

select count(department_id),sum(salary),round(avg(salary),0),max(salary),min(salary)
from employees;

select department_id "Depatment name",salary,job_id"role",avg(salary)"avg salary",first_name ,count(department_id) "total id",sum(salary) "total salary",round(avg(salary),3) "avg salary",max(salary) "max sal",max(first_name),min(salary)"min sal"
from employees
Group By Department_Id,Salary,Job_Id, First_Name;

select salary, max(first_name(salary))
from employees
group by salary
having first_name = max(salary);

select salary(max(first_name))
from employees;

select department_id, sum(salary), round(avg(salary),0),max(salary),min(salary)
from employees
group by department_id;

select employee_id, last_name,salary,
case JOB_ID when 'IT PROG' then salary*1.5+salary
            when 'SA-REP' then salary*0.5+salary
            when 'IT-MAG' then salary*0.8+salary
else salary
end salary
from employees;


select first_name 
from employees;

select first_name "name",salary*12 "annual salary"
from employees;

select first_name||' '||last_name||' is a '||salary
from employees;

select first_name||q'|Employee's salary is |'||salary sal
from employees;

select distinct salary,first_name      --it erases the duplicates only in the display not in the real sheet
from employees;

select *
from employees
where department_id=80 AND salary > 11000 AND salary <> 11000;

select *
from employees
--where salary IN(8000,10000,20000);
where salary BETWEEN 8000 AND 10000;

SELECT *
FROM employees
WHERE salary = &sal;

select &colName   --col name
from &table       --table name 
where &col;       --condition

select &&col, last_name
from &table
where &con
order by first_name;      --ascending order

DEFINE
select &&colname, first_name, last_name
from employees
where &&condition
order by first_name desc;  --descending order

select employee_id,last_name,department_id,department_name
from employees
natural join departments;

 

select * from departments
order by manager_id;

 

select employee_id,last_name,employees.department_id,manager_id,department_name
from employees 
join departments
using(manager_id);

 

select employee_id, last_name,employees.department_id,department_name
from employees
join departments
on (employees.department_id=departments.department_id);

 

select employee_id,last_name,employees.manager_id,department_id,department_name
from employees 
join departments
using(department_id)
where employees.manager_id=100
order by employee_id;

 

select * from employees
where department_id IS NULL;

 

select employee_id, last_name,department_name,employees.department_id
from employees
right outer join departments
on(employees.department_id = departments.department_id);

 

select department_name,employee_id, last_name,employees.department_id
from employees
left outer join departments
on(employees.department_id = departments.department_id);

 
select employee_id, last_name,department_name,employees.department_id
from employees
full outer join departments
on(employees.department_id = departments.department_id);

 
select employee_id, last_name,department_name,employees.department_id
from employees
cross join departments;

 
select e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name
from employees e
join employees m
on(e.manager_id = m.employee_id);

SELECT SALARY FROM EMPLOYEES WHERE LAST_NAME='Abel';

 

SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY = (SELECT SALARY FROM EMPLOYEES WHERE LAST_NAME='Abel');

 

SELECT EMPLOYEE_ID,SALARY
FROM EMPLOYEES
WHERE SALARY >(SELECT SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID = 100);

 

SELECT * FROM EMPLOYEES;

SELECT EMPLOYEE_ID,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN(SELECT DEPARTMENT_ID FROM EMPLOYEES WHERE LAST_NAME = 'Taylor' ) AND 
SALARY > ANY(SELECT SALARY FROM EMPLOYEES WHERE LAST_NAME='Taylor') ;


SELECT EMPLOYEE_ID,DEPARTMENT_ID,SALARY FROM EMPLOYEES
WHERE SALARY IN(SELECT MIN(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID);

has context menu
Compose

select employee_id,manager_id from employees; -- employee

select employee_id,manager_id from employees;  -- Manager

 

select employee_id,last_name,job_id,salary,department_name,city
from employees e
join departments d
on(e.department_id=d.department_id)
join locations l
on(d.location_id = l.location_id);

 

select employee_id,last_name,job_id,salary,department_name,city
from employees
join departments
using(department_id)
join locations
using(location_id);


desc job_history;

------------------------------SET OPERATOR------------------------------------------

select employee_id,job_id                     --union
from employees
union
select employee_id,job_id
from job_history
order by employee_id;

select employee_id,job_id                 --union all
from employees
union all
select employee_id,job_id
from job_history
order by employee_id;

select employee_id,job_id,department_id
from employees
intersect
select employee_id,job_id,department_id
from job_history;

select employee_id,job_id
from employees
minus
select employee_id,job_id
from job_history
order by employee_id;

desc employees;

select employee_id,job_id,salary
from employees
union
select employee_id,job_id,0
from job_history
intersect
select employee_id,job_id,salary
from employees
order by employee_id;

select employee_id,job_id,salary
from employees
union
select employee_id,job_id,first_name
from job_history
intersect
select employee_id,job_id,varchar(null)
from employees
order by employee_id;

----------INSERT----------------
CREATE TABLE job_grades 
(
grade 		CHAR(1),
lowest_sal 	NUMBER(8,2) NOT NULL,
highest_sal	NUMBER(8,2) NOT NULL
);

ALTER TABLE job_grades
ADD CONSTRAINT jobgrades_grade_pk PRIMARY KEY (grade);

INSERT INTO job_grades VALUES ('A', 1000, 2999);
INSERT INTO job_grades VALUES ('B', 3000, 5999);
INSERT INTO job_grades VALUES ('C', 6000, 9999);
INSERT INTO job_grades VALUES ('D', 10000, 14999);
INSERT INTO job_grades VALUES ('E', 15000, 24999);
INSERT INTO job_grades VALUES ('F', 25000, 40000);

COMMIT; 

----------------------------------------
create table hire_dates
(id number(8),hire_date DATE DEFAULT sysdate);

select * from hire_dates;

insert into hire_dates values(101,'02-09-2001');
insert into hire_dates(id) values(102);
---------------------------------------
create table hire_dates1
(id number(10), hire_date DATE);

insert into hire_dates1 values(101,'16-05-2001');
insert into hire_dates1(id) values(102);

select * from hire_dates1;

-----------------------------------
create table dept80;
as
  select employee_id,last_name,salary*12 annsal, hire_date
  from employees
  where department_id=80;
------------------------------------------
alter table employees read only;
update employees
set salary=10000
where last_name = 'Abel';
alter table employees read write;
select * from employees
where last_name='Abel';
rollback;
----------------------------------------------
create view empvu80
as select employee_id,last_name,salary
   from employees
   where department_id=80;
   
select * from empvu80;
----------------------------------------------------
create or replace view dept_sum_vu
(name,minsal,maxsal,avgsal)
as select d.department_name,min(e.salary),
          max(e.salary),avg(e.salary)
    from employees e join departments d
    on (e.department_id = d.department_id)
    group by d.department_name;
    
select * from empvu80;
------------------------------------------------------
delete from empvu80 where last_name = 'King';

----------------FLASHBACK--------------------------------------
drop table job_grades;
select * from job_grades;
flashback table hr.job_grades to before drop;


------------------SEQUENCE----------------------------------------------
create sequence dept_deptid_seq
                increment by 10
                start with 120
                maxvalue 9999
                nocache
                nocycle;
                
insert into departments values(dept_deptid_seq.next where ,'Training',null,null);
drop sequence dept_deptid_seq;
----------------------------------------------------------
create sequence dept_seq
                increment by 10 
                start with 300 
                nocycle
                nocache;
                
insert into departments values(dept_seq.nextval,'Training',null,null);
                
select dept_seq.nextval                   --
from dual;

select dept_seq.nextval,dept_seq.currval  --cuurent calue
from dual;

----------INDEX-------------------------------------
create index 

------------SYNONYM---------
create synonym emp
for employees;

drop synonym emp;

select* from employees;

select * from emp;
--------------------------DCL REVOKE GRANT-----------------------------------
create user userA identified by ResetA123;

------------------CHANGE PASSWRD------------------------------------

alter user hr
indentified by e;

---------------CHECKING PRIVILEGES---------------------------
select * from user_tab_privs_made;
select * from user_sys_privs;





