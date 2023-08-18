create table table1(managerId int,departmentId int);
create table table2(managerId int,departmentId int);
select * from table1;
insert into table1 values(15,1);
insert into table1 values(16,2);
insert into table1 values(17,3);
insert into table1 values(18,4);
insert into table1 values(19,5);
insert into table1 values(15,6);
insert into table2 values(15,20);
insert into table2 values(16,21);
insert into table2 values(17,22);
insert into table2 values(18,23);
insert into table2 values(15,24);
insert into table2 values(16,25); 
insert into table2 values(15,1); 
insert into table2 values(15,1);
select * from table1;
select * from table2;
select table1.departmentId,table2.departmentId,managerId from table1 join table2 using(managerId);
select table1.departmentId,table2.departmentId,managerId from table1 join table2 using(managerId);

select t1.departmentid, t1.managerid,t2.managerid from table1 t1 join table1 t2 on(t1.managerid = t2.managerid) ;  -- self join

--truncate table table1;
--truncate table table2;
select * from table1;
select * from table2;

select table1.managerId,table2.departmentId from table1 left outer join table2 on(table1.managerId=table2.managerId and table1.departmentid=table2.departmentId);

select table1.managerId,table2.departmentId from table1 right outer join table2 on(table1.managerId=table2.managerId and table1.departmentid=table2.departmentId);



desc employees;
desc locations;
desc departments;


select employee_id,last_name,job_id,salary,department_id,department_name,city
from employees
natural join departments
join locations
on(departments.location_id=locations.location_id);




-- Three Way JOIN!!!!!
select employee_id,last_name,job_id,salary,department_name,city
from employees
join departments
using (department_id)
join locations
using(location_id);


--SELF JOIN
select t1.departmentid, t1.managerid,t2.managerid from table1 t1 join table1 t2 on(t1.managerid = t2.managerid) ; 

select departmentid, managerid,managerid from table1 t1 join table1 t2 on(t1.managerid = t2.managerid) ; --Ambiguity problem


