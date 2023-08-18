desc employees;
desc departments;

select employee_id,first_name,last_name,department_name from employees
natural join departments;--natural joins


select employee_id,first_name,department_id--,employees.manager_id 
from employees
join departments 
USING (department_id);--using


select employee_id,first_name,employees.department_id,departments.manager_id
from employees
join departments
on(employees.department_id=departments.manager_id);--on



select employee_id,first_name,employees.department_id,departments.manager_id
from departments
join employees
on(employees.department_id=departments.manager_id);--on



select employee_id,first_name,last_name,department_name from employees
natural join departments;--nalural join


select employee_id,first_name,last_name,department_name,employees.department_id
from employees
left outer join departments
on(employees.department_id=departments.department_id);--left outer join



select employee_id,first_name,last_name,department_name,d.department_id
from employees e
right outer join departments d
on(e.department_id=d.department_id);--right outer join



select*from employees;
select*from departments;



select e.employee_id,e.first_name,e.last_name,e.department_id
from employees e
join employees m
on(e.department_id=m.department_id);--self joins



select employee_id,first_name,last_name,department_name,d.department_id,e.manager_id
from employees e
cross join departments d;--cross joins



select employee_id,first_name,last_name,department_name,employees.department_id,departments.manager_id
from employees
left outer join departments
on(departments.department_id=departments.manager_id);--left outer join

select employee_id,last_name,job_id,salary,department_name,city
from employees
join departments
using(department_id)
join locations
using(location_id);
--on(departments.location_id=locations.location_id);--three way joint






