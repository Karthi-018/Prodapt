---------------------------16-08-2023-------------------------------------------
--Case_operation
/*
select employee_id,last_name,job_id,salary,
case job_id when 'AD_PRES' then salary+salary*0.1
            when 'AD_VP' then salary+salary*0.3
            when 'IT_PROG' then salary+salary*0.5
            else salary 
end as Case
from employees;         

*/

-- dec0de_Operation
/*
select employee_id,last_name,job_id,salary,
decode( job_id , 'AD_PRES' , salary+salary*0.1,
             'AD_VP' , salary+salary*0.3
            , 'IT_PROG' , salary+salary*0.5
            , salary )
 as Decode
from employees;
*/


/* Count operation
select count(*)
from employees;

*/

/* predefined method 

select sum(salary) Total ,
round(avg(salary),2) Average, 
max(salary) Maximum,
min(salary) Minimum,
round(variance(salary),2) Variance
from employees;
*/

/*
select department_id,job_id,salary,
count(department_id),
sum(salary),max(salary), 
min(salary), 
round(avg(salary),2)
from employees
group by department_id,job_id,salary
order by department_id;

*/

/*
select department_id,job_id,salary,round(avg(salary),0)
from employees
group by department_id,job_id,salary
having avg(salary)>10000
order by department_id;
*/

/*
