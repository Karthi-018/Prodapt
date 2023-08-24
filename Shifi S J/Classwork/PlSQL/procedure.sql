--create table dept as select * from departments;

create procedure add_department is
v_dept_id dept.department_id%type;
v_dept_name dept.department_name%type;
begin
v_dept_id:=280;
v_dept_name:='ST-Curriculum';
insert into dept(department_id,department_name) values(v_dept_id,v_dept_name);
dbms_output.put_line('Inserted' ||Sql%rowcount|| 'row');
end;



begin
add_department;
end;

select * from dept;



------------------------parameter passing------------------------

create procedure add_depart(dept_id dept.department_id%type, dept_name dept.department_name%type) is
begin
insert into dept(department_id,department_name) values(dept_id,dept_name);
dbms_output.put_line('Inserted');
end;

 

begin 
add_depart(300,'Trainer');
end;


select * from dept;


------------------------using variables---------------------------------

create procedure add_depart1(dept_id dept.department_id%type, dept_name dept.department_name%type) is
v_id dept.department_id%type:=dept_id;
v_name dept.department_name%type:=dept_name;
begin
insert into dept(department_id,department_name) values(v_id,v_name);
dbms_output.put_line('Inserted');
end;

begin 
add_depart1(302,'Traineee');
end;


select * from dept;

