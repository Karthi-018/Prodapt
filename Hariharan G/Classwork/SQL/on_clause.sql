select * from job_grades;
select employee_id,last_name,job_id,salary,grade
from employees
join job_grades
on(employees.salary between job_grades.lowest_sal and job_grades.highest_sal);