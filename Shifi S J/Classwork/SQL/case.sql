select employee_id,last_name,salary,
case job_id when 'IT_PROG' then salary*0.10+salary
when 'PU_MAN' then salary*0.8+salary
when 'PU_CLERK' then salary*0.1+salary
else salary
END As Anuual_Salary from employees;
