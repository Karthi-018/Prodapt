desc employees
desc departments;


select employee_id,last_name,department_id,department_name
from employees
natural join departments;

select employee_id,last_name,department_name
from employees
join departments
using(department_id);

select employee_id,last_name,manager_id,department_name
from employees
join departments
using(manager_id);

select employee_id,last_name,manager_id,department_name  
from employees
join departments
using(manager_id)
where manager_id=124;

select employee_id,last_name,manager_id,department_name   ---Throws Error-in using where clause with qualifier cannot be used
from employees
join departments
using(manager_id)
where employees.manager_id=124;

select employee_id,last_name,employees.department_id,department_name  --specifying the particular table-here employees table
from employees
join departments
on(employees.department_id=departments.department_id);


select employee_id,last_name,departments.department_id,department_name  --specifying the particular table-here department table 
from employees
join departments
on(employees.department_id=departments.department_id);

select employee_id,last_name,departments.department_id,department_name,employees.manager_id 
from employees
join departments
on(employees.department_id=departments.department_id);

select employee_id,department_name
from employees
join departments
on(employees.department_id=departments.department_id);

select employee_id,last_name,departments.department_id,department_name  
from employees
join departments
on(employees.department_id=departments.department_id and employees.manager_id=departments.manager_id);

select*from employees where department_id is null;    --prints department id with null value

select employee_id,last_name,employees.department_id,department_name  
from employees
left outer join departments
on(employees.department_id=departments.department_id);

select employee_id,last_name,e.department_id,department_name  
from employees e
left outer join departments d
on(e.department_id=d.department_id);

select employee_id,last_name,d.department_id,department_name  
from employees e
left outer join departments d
on(e.department_id=d.department_id);

select employee_id,last_name,e.department_id,department_name  
from employees e
right outer join departments d
on(e.department_id=d.department_id);

select employee_id,last_name,e.department_id,department_name  
from employees e
full outer join departments d
on(e.department_id=d.department_id);

select employee_id,last_name,d.department_id,department_name  
from employees e
full outer join departments d
on(e.department_id=d.department_id);

select employee_id,last_name,employees.department_id,department_name  
from employees
right outer join departments
on(employees.department_id=departments.department_id);

select employee_id,last_name,employees.department_id,department_name  
from employees
full outer join departments
on(employees.department_id=departments.department_id);

select employee_id,last_name,e.department_id,department_name  
from employees e
left outer join departments d
on(e.department_id=d.department_id);

select employee_id,last_name,departments.department_id,department_name  
from employees
cross join departments;

select e.employee_id,e.last_name,e.manager_id,m.employee_id,m.last_name
from employees e
join employees m
on(e.manager_id=m.employee_id);


select employee_id,last_name,job_id,salary,department_name,city
from employees
join departments
using (department_id)
join locations
using (location_id);






