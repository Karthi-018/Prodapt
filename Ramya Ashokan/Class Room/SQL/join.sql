select table_name from user_tables;
drop table job_grades;
select * from job_grades;
flashback table hr.job_grades to before drop;
CREATE TABLE job_grades (

grade 		CHAR(1),

lowest_sal 	NUMBER(8,2) NOT NULL,

highest_sal	NUMBER(8,2) NOT NULL

);

desc job_grades;
ALTER TABLE job_grades

ADD CONSTRAINT jobgrades_grade_pk PRIMARY KEY (grade);


INSERT INTO job_grades VALUES ('A', 1000, 2999);

INSERT INTO job_grades VALUES ('B', 3000, 5999);

INSERT INTO job_grades VALUES ('C', 6000, 9999);

INSERT INTO job_grades VALUES ('D', 10000, 14999);

INSERT INTO job_grades VALUES ('E', 15000, 24999);

INSERT INTO job_grades VALUES ('F', 25000, 40000);
select * from job_grades;
select * from jobs;
select * from employees;
select e.employee_id,e.last_name,e.job_id,e.salary,jg.grade
from employees e join 
 job_grades jg
on e.salary  between jg.lowest_sal and jg.highest_sal ;
COMMIT;
desc employees;
desc departments;
select * from employees;
select * from departments;
--Naural join
select employee_id,last_name,department_id,department_name from employees natural join departments;

select e.employee_id,e.last_name,d.department_id,d.department_name from employees e join departments d
on (e.department_id=d.department_id and e.manager_id=d.manager_id);
--using
select employee_id,last_name,departments.department_id,department_name,manager_id
from employees  join departments  using(manager_id);--if we have put other common columnin select statement which is not using in "using clause " mention the tablename compulsary otherwise ambiguity 

select e.employee_id,e.last_name,d.department_id,d.department_name,manager_id
from employees e join departments d 
using(manager_id)
where d.department_id=100;--can't able to give where condition for "using clause" coulumn;;
--don't mention alias name for column in using clause.

select e.employee_id,e.last_name,d.department_id,d.department_name,d.manager_id from employees e join departments d
on (e.department_id=d.department_id );

--outer joins
select employee_id,last_name,department_name,e.department_id
from departments d 
left outer join employees e 
on(d.department_id=e.department_id);

select employee_id,last_name,department_name,e.department_id
from employees e 
left outer join departments d
on(e.manager_id=d.department_id);--?

--right outer join
select employee_id,last_name,department_name,e.department_id
from employees e 
right outer join departments d
on(e.department_id=d.department_id);

--full outer join
select employee_id,last_name,department_name,e.department_id
from employees e 
full outer join departments d
on(e.department_id=d.department_id);

--cross join
select employee_id,last_name,department_name,e.department_id
from departments d 
cross join employees e;
select* from employees order by last_name;
--self join
select e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name,m.manager_id
from employees e 
join employees m
on(e.manager_id=m.employee_id) order by m.manager_id;

desc locations;
desc departments;
desc employees;

--three way joins,equi join
select * from employees;
 select e.employee_id, e.last_name,e.job_id,e.salary,d.department_name,l.city 
 from employees e 
 join departments d 
 on (e.department_id=d.department_id)  
 join locations l 
 on (d.location_id=l.location_id);
 
 --sbquery nested inner
 --two types single row subquery (use ' =,<,>,<=,>=,<>') and multi row subquery use ('in,any, all')
 select * from employees order by department_id;
 --single row
 select * from employees where salary>(select salary from employees where last_name='Abel');
  select * from employees where salary>(select salary from employees where employee_id=100);
   --select * from employees where salary >all(select salary,department_id from employees where department_id in(select department_id from employees where last_name='Abel' ) );
   --single rows subquery only one abel
   select * from employees 
   where department_id =(select department_id from employees where last_name='Abel') 
   and salary> (select salary from employees where last_name='Abel');
   
   --multi row subquery two taylor
   select * from employees 
   where department_id in(select department_id from employees where last_name='Taylor') 
   and salary >any(select salary from employees where last_name='Taylor');
 --muliti row subquery
 select * from employees where department_id in(select department_id from employees where last_name='King');
 
 