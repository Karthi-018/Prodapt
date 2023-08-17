create table table1 (

    ename varchar2(30),

    dept varchar2(30)

);


create table table2 (

    ename varchar2(30),

    salary integer

);


select * from table1;

alter table table1 add eid integer;
alter table table2 add eid integer;
delete from table1;
delete from table2;

insert into table1 values('arun','dev',100);

insert into table1 values('shalini','dev',101);

insert into table1 values('maya','test',102);

insert into table1 values('sneha','support',103);

insert into table1 values('pro','hr',105);

insert into table1 values('ravi','hr',107);
-------------------------------------------------
insert into table2 values('arun',10050,100);

insert into table2 values('shalini',10000,104);

insert into table2 values('poruo',2000,106);

insert into table2 values('sneha',15000,102);

insert into table2 values('ram',5000,105);

insert into table2 values('ravi',100,107);

----------------NATURAL JOIN----------------------------------------------------
select ename,salary,dept 
from table1
natural join table2;

-------------------USING--------------------------------------------------------
select ename,salary,dept
from table1
join table2
using(ename);
------------------------ON------------------------------------------------------
select salary,dept,table1.ename
from table1
join table2 
on(table1.ename=table2.ename and salary=10000);

------------------------LEFT JOIN-----------------------------------------------
select table1.ename,table1.eid,dept,salary --mention the table name only for the common values
from table1 
left outer join table2
on(table1.ename=table2.ename);

----------------------RIGHT OUTER JOIN------------------------------------------
select *
from table1 
right outer join table2
on(table1.ename=table2.ename);

-------------------------FULL OUTER JOIN----------------------------------------
select table1.ename,table1.eid,dept,salary
from table1 
full outer join table2
on(table1.ename=table2.ename);

-------------------------------SELF JOIN----------------------------------------


------------------------------3 WAY JOIN----------------------------------------
select employees.employee_id,employees.last_name,employees.job_id,employees.salary,departments.department_name,locations.city
from employees 
join departments using(department_id)
join locations using(location_id);
