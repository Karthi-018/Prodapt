CREATE TABLE employeesdetail1(
  FirstName VARCHAR(40),
  LastName VARCHAR(45),
  Email Varchar(50),
  Phone Varchar(45),
  Passwd  Varchar(30));
  
  select * from employeesdetail;
    select * from employeesdetail1;
    drop table employeesdetail1;
drop procedure add_job_history1;
drop trigger insert_job_history1;
  create or replace TRIGGER insert_job_history1
  AFTER INSERT ON employeesdetail
  FOR EACH ROW
BEGIN
  add_job_history1(:old.FirstName, :old.LastName, :old.Email,
                  :old.Phone, :old.Passwd);
END;
/
create or replace PROCEDURE add_job_history1
  ( p_firstname          employeesdetail.firstname%type,
  p_lastname           employeesdetail.lastname%type,
   p_email          employeesdetail.email%type,
   p_phone employeesdetail.phone%type,
   p_passwd          employeesdetail.passwd%type
   )
IS
BEGIN
  INSERT INTO employeesdetail1
    VALUES(p_firstname, p_lastname, p_email, p_phone, p_passwd);
END add_job_history1;
/
