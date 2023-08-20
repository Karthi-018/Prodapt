create table tab1 (

    ename varchar2(30),
    
    dept varchar2(30),
    eid int 

);


create table tab2 (

    ename varchar2(30),

    salary integer,
    eid int
);




insert into tab1 values('arun','dev',100);

insert into tab1 values('shalini','dev',101);

insert into tab1 values('maya','test',102);

insert into tab1 values('sneha','support',103);

insert into tab1 values('pro','hr',105);

insert into tab1 values('ravi','hr',107);
-------------------------------------------------
insert into tab2 values('arun',10050,100);

insert into tab2 values('shalini',10000,104);

insert into tab2 values('poruo',2000,106);

insert into tab2 values('sneha',15000,102);

insert into tab2 values('ram',5000,105);

insert into tab2 values('ravi',100,107);

----------------NATURAL JOIN----------------------------------------------------
select * from tab1;
select * from tab2;
select ename,salary,dept 
from tab1
natural join tab2;

-------------------USING--------------------------------------------------------
select ename,salary,dept,tab1.eid
from tab1
join tab2
using(ename);
------------------------ON------------------------------------------------------
select salary,dept,tab1.ename
from tab1
join tab2 
on(tab1.ename=tab2.ename and salary=10000);

------------------------LEFT JOIN-----------------------------------------------
select tab1.ename,tab1.eid,dept,salary --mention the table name only for the common values
from tab1 
left outer join tab2
on(tab1.eid=tab2.eid);

----------------------RIGHT OUTER JOIN------------------------------------------
select *
from tab1 
right outer join tab2
on(tab1.ename=tab2.ename);

-------------------------FULL OUTER JOIN----------------------------------------
select tab1.ename,tab1.eid,dept,salary
from tab1 
full outer join tab2
on(tab1.ename=tab2.ename);

-------------------------------SELF JOIN----------------------------------------


------------------------------3 WAY JOIN----------------------------------------
select employees.employee_id,employees.last_name,employees.job_id,employees.salary,departments.department_name,locations.city
from employees 
join departments using(department_id)
join locations using(location_id);
