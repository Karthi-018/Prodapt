select employee_id,last_name,job_id,salary,grade
from employees
join job_grades
on(employees.salary between job_grades.lowest_sal  and job_grades.highest_sal );--non equi joins

select * from employees
where department_id in
(select department_id from employees where last_name='King');

select * from employees 
where salary=
(select salary from employees where last_name='Abel');

select * from employees 
where salary >
(select salary from employees where employee_id=100);

select * from employees
where department_id in  
(select department_id from employees where last_name ='Abel')
and salary >(select salary from employees  where last_name ='Abel');

select * from employees
where department_id in  
(select department_id from employees where last_name ='Taylor')
and salary > any(select salary from employees  where last_name ='Taylor');--multiquerry

select * from employees
where salary in (select min(salary) from employees group by department_id);


