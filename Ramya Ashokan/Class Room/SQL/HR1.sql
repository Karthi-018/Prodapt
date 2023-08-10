select table_name from user_tables;
describe jobs;
desc locations;--show the structure of the table
select * from employees;--don't give * and coulumn name simultaneously;
select first_name,last_name,salary,salary*12  as "Annual_Income" from employees;--don't give space in column name
select  first_name||' '||last_name as Name from employees;--||concat two columns
select  first_name||' is a '||job_id  as "Employee_Details" from employees;--||concat two columns
select  first_name||q'[ "Employees Manager is "]'||manager_id  as "Employee_Details" from employees;--use queue q ->for printing special character like '' "" in string use delimiter[not in numbers and alphabet]
select distinct First_name from employees;
select  first_name||' '|| last_name as Name from employees;

--Restricting and Sorting
select * from employees where salary not in(4800,17000);
select *from employees;
select * from employees where first_name like '%ll%';--?
select * from employees where salary between 4800 and 17000 order by first_name desc;
--select &calName from employees where  salary between &con;--dynamic query using &
--select &&calName from &tabName where &con order by &calName;
--select &&calName1,&calName2 from &tabName where &con order by &calName1;
--undefine calName1;
set verify on;
select &&calName1,&calName2 from &tabName where &con order by &calName1;--?
undefine calName1;
