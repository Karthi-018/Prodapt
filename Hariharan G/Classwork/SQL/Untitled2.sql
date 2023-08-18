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



--SELF JOIN
select t1.departmentid, t1.managerid,t2.managerid from table1 t1 join table1 t2 on(t1.managerid = t2.managerid) ; 

select departmentid, managerid,managerid from table1 t1 join table1 t2 on(t1.managerid = t2.managerid) ; --Ambiguity problem
