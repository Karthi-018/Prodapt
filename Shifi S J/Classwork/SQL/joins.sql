Table creation


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



Joins:


select employee_id,last_name,department_id,department_name
from employees
natural join departments;




select employee_id,last_name,manager_id,department_name
from employees
join departments
using (manager_id);




select employee_id,last_name,departments.department_id,department_name,employees.Manager_id
from employees
join departments
on(employees.department_id=departments.department_id);




select employee_id,last_name,employees.department_id,department_name
from employees
join departments
on(employees.department_id=departments.department_id);




select employee_id,last_name,manager_id,department_name
from employees
join departments
using (manager_id);
--where employees.Manager_id=1234;   //should not be used




select department_name,employee_id,last_name,employees.department_id
from departments
left outer join employees
on(departments.department_id=employees.department_id);


select department_name,employee_id,last_name,employees.department_id
from departments
full outer join employees
on(departments.department_id=employees.department_id);



select department_name,employee_id,last_name,employees.department_id
from departments
right outer join employees
on(departments.department_id=employees.department_id);



select department_name,employee_id,last_name,e.department_id
from departments d
cross join employees e;



self join or INNER JOIN:

select e.employee_id,e.last_name,e.first_name,e.manager_id,m.employee_id,m.last_name,m.first_name
from employees e
join employees m
on(e.manager_id=m.employee_id);



TASK:

select employee_id,last_name,employees.job_id,employees.salary,departments.department_name,city
from employees
join departments
on(employees.department_id=departments.department_id)
--using(department_id)  //also used
join locations
on(departments.location_id=locations.location_id);
--using(location_id)  //also used



select employee_id,last_name,employees.job_id,salary,grade
from employees
join job_grades
on(salary between lowest_sal and highest_sal);



SUBQUERY:


select * from employees
where department_id in
(select department_id from employees
where last_name='King');  //King's cllegues i.e having same dept name



select * from employees
where salary =
(select salary from employees
where last_name='Abel');   //same as Abel salary




select * from employees
where salary >
(select salary from employees
where employee_id=100);    //salary greater than emp_id=100




select * from employees
where department_id in
(select department_id from employees where last_name='Abel')and salary >11000;   //one way



select department_id,salary,last_name from employees
where department_id in
(select department_id from employees where last_name='Taylor') and 
salary > any (select salary from employees where last_name='Taylor');   //multirow aubquery //last_name Taylor same dept
_id and salary > him //multirow because two Taylors.



select * from employees where salary = any (select min(salary) from employees group by department_id);   //gives minimum salaries in all dept_ids







