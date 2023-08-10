select employee_id,last_name,salary,
decode(job_id , 'IT_PROG' , salary*0.10+salary, 'PU_MAN' , salary*0.8+salary, 'PU_CLERK' , salary*0.1+salary, salary)
As Anuual_Salary from employees;
