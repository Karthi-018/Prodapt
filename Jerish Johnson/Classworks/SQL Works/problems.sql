--order i ascending order based on salary
select * from employees order by salary desc;

select first_name||last_name "Name" from employees; 

select first_name from employees where first_name like '%a';

select distinct salary from employees;

select * from employees;

select * from employees where salary>5000 and salary<10000 order by salary;

select &colname from employees where salary>&sal order by salary;

select upper (first_name) from employees;

--common deoartment having salary greater than 10000
select department_id,count(department_id) from employees where salary>10000 group by department_id;


select * from jobs;
describe jobs;

select salary, to_char(salary,'99,999') from employees;
