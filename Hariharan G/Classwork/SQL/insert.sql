create table Emp
(eid number,ename varchar(50),salary number);
commit;
create table copyEmp
(empId number);  
rollback; 
select*from copyEmp;