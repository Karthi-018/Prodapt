--------------------------------CASE--------------------------------------------
select table_name from user_tables;
select * from employees;
select employee_id,last_name,salary,
case job_id when 'IT_Prog' then salary*0.10+salary
            when 'SA_REP' then salary*0.5+salary
            when 'IT_MGR' then salary*0.1+salary
            else salary
end as "SAL"
from employees;
-----------------------------DECODE---------------------------------------------
select employee_id,last_name,salary,
decode (job_id , 'IT_Prog' , salary*0.10+salary
            ,'SA_REP' , salary*0.5+salary
            , 'IT_MGR' , salary*0.1+salary
            , salary
) as "SAL"
from employees;

-------------------------------MULTI ROW FN--------------------------------------
select sum(salary) from employees;
select avg(salary)from employees;
select max(salary) as highest_salary from employees;
select min(salary) as minimum_salary from employees;
select sum(salary)as tot_sal,round(avg(salary),2)as avg_sal,max(hire_date) as max_date,min(hire_date)as min_date from employees;

----------------------------MULTI ROW FUNCTIONS---------------------------------
select round(sum(salary)/count(*),2),
round((sum(salary)/count(manager_id)),2),
round(avg(salary),2)
from employees;

------------------------------GROUP BY------------------------------------------
select department_id, count(department_id)as count_dept,sum(salary)as sum_sal from employees
group by department_id
order by department_id;

-----------------------------GROUP BY-------------------------------------------
select department_id,job_id, count(department_id)as count_dept,sum(salary)as sum_sal from employees
group by department_id,job_id
order by department_id;
--------------------------------------------------------------------------------
