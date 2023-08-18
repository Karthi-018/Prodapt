select * from employees where department_id in (select department_id from employees
where last_name='King');

--single row sub query
select * from employees where salary=(select salary from employees where last_name='Abel');

select * from employees where salary>(select salary from employees where employee_id=100);

select * from employees where department_id IN
(select department_id from employees where last_name='Taylor')
and
salary > any (select salary from employees where last_name='Taylor');



select * from employees where department_id in(select department_id from employees where last_name=(select last_name from employees where salary=24000));


select * from employees where salary in 
(select min(salary) from employees group by department_id);