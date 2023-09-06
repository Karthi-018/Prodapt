set serveroutput ON;
declare
e_duplicate_excep exception;
pragma exception_init(e_duplicate_excep,-00001);
begin 
insert into employees values(111,'Shifi','Ss','sss',null,sysdate,'trainee',null,299,11,10000);
exception
when e_duplicate_excep then 
dbms_output.put_line('Insertion failed');
--dbms_output.put_line(SQLCODE);
dbms_output.put_line(SQLERRM);

end;



--select employee_id from employees;
