--select *from employees;
select Employee_id,last_name,salary,
DECODE( job_id , 'PU_CLERK' , salary*0.2 
           , 'ST_MAN' , salary*0.5
          ,'ST_CLERK' , salary*0.8 
            ,salary
) "Salary"
from employees;

select Employee_id,last_name,salary,
case  job_id when 'PU_CLERK'then salary*0.2 
           when 'ST_MAN' then salary*0.5
          when 'ST_CLERK'then salary*0.8 
        else salary
end SALARY
from employees;


--select count(*) from employees;
--select round(sum(salary),2) "total salary",round(avg(salary),2) "average salary",max(salary),min(salary),Max(first_name),min(first_name),max(hire_date) 
--from employees;

--select max(salary) from employees;

select round(sum(salary)/count(*),2),
round(sum(salary)/count(nvl(salary,0),2)),
round(avg(salary),2)
from employees;

select*from employees;

select  department_id,job_id ,count(department_id),sum(salary)
from employees

group by department_id,job_id
having (avg(salary))between 6000 and 10000
order by department_id;

