-- Aggregate functions(sum,avg,min,max,count)
select * from employees;

select max(salary) max,min(salary) min , round(avg(salary),2) avg, count(salary) count, sum(salary) sum
from employees;

select sum(salary)/count(*) avg
from employees;

select department_id,sum(salary) sum
from employees
where department_id IS not NULL
group by department_id
having SUM(salary)>50000;
