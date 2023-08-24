Begin
insert into employees(employee_id,first_name,last_name,email,hire_date,job_id,salary)
values(218,'Ruth','Cores','RCORES',current_date,'AD_ASST',40000);
End;       //adds new row to the table


update employees set salary =18000 where last_name='King';   //updates the salary for two king




select * from employees;