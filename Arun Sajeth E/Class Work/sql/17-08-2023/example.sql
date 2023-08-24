------------------------- Using clause -----------------------------------------
select employee_id,last_name,manager_id,department_name
from employees
join departments
using(manager_id)
---where  employees.manager_id=124;--- error using clause column name should present in where clause
where employees.department_id=30;


--------------------------- On Clause    ---------------------------------------
select employee_id,last_name,departments.department_id,department_name,employees.manager_id
from employees
join departments
on(employees.department_id = departments.department_id);




--------------------------- Natural Join --------------------------------------
select employee_id,last_name
from employees
NATURAL JOIN departments;


------------------------- full outer join --------------------------------------
select employee_id,last_name,department_name,d.department_id
from employees e
full outer join departments d
ON d.department_id = e.department_id;

-------------------------- left outer join -------------------------------------
select employee_id,last_name,department_name,d.department_id
from employees e
left outer join departments d
ON d.department_id = e.department_id;

--------------------------- right outer join -----------------------------------
select employee_id,last_name,department_name,d.department_id
from employees e
right outer join departments d
ON d.department_id = e.department_id;


---------------------------Cross outer join ------------------------------------
select employee_id,last_name,department_name,d.department_id
from employees e
cross join departments d;

-------------------------- self join -------------------------------------------
select e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name
from employees e
join employees m
on(e.manager_id=m.employee_id);

select employee_id,manager_id from employees;

select employee_id,manager_id from employees;


desc departments;
desc employees;
------------------------------- 3 join method-----------------------------------
select employee_id,last_name,job_id,salary,department_name,city
from employees e
join departments using(department_id)
join locations using (location_id);



-------------------------------------------------------------------------------
CREATE TABLE job_grades (
grade CHAR(1),
lowest_sal NUMBER(8,2) NOT NULL,
highest_sal NUMBER(8,2) NOT NULL
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

------------------------------- examples ---------------------------------------

select * from job_grades;

select employee_id,last_name,salary,grade
from employees
join job_grades
on(salary between lowest_sal and highest_sal);

------------------------------Single row subquery-------------------------------
 
 select * from employees
 where salary >
 (select salary from employees
 where employee_id=100);
 
 
 select * from employees
 where salary > any
 (select salary from employees
 where last_name='Taylor') and department_id in 
 (select department_id from employees
 where last_name='Taylor');
 
 
 select * from employees
 where salary in (select min(salary) from employees
 group by department_id);
 
 
 ------------------------------------------------------------
 */
 
 desc job_history;
