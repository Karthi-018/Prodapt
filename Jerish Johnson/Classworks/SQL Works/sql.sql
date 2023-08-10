select table_name from user_tables;

select first_name from EMPLOYEES;
describe employees;

--4.Using Conversion Fuctions and Conditional Expressions
to_char('10-08-2023','fmDD Month YYYY');

--coalesce function
select employee_id,last_name,manager_id,commission_pct,coalesce(commission_pct,manager_id,0) from employees;
--Using case
select employee_id,last_name,salary,
case job_id when 'IT-Prog' then salary*0.5+salary
            when 'SA_REP' then salary*0.8+salary
            when 'IT_MGR' then salary*1+salary
            else salary 
end "U SAL"
from employees;

--using decode
select employee_id,last_name,salary,
decode (job_id , 'IT-Prog' , salary*0.5+salary
            , 'SA_REP' , salary*0.8+salary
            , 'IT_MGR' , salary*1+salary
            , salary 
) "Update SAL"
from employees;

select count(*) from employees;

select sum(salary) "total salary", round(avg(salary),2) "CAL",max(salary) Max,min(salary) Min from employees;

select min(hire_date) from employees;

--using group by
--if aggreagate functions and non aggregate functions are used then goup by are used
select count(department_id),
sum (salary),round(avg(salary),0),
max(salary),
min(salary)
from employees
group by department_id,job_id
order by department_id;





