SET SERVEROUTPUT ON;
DECLARE
CURSOR c IS
SELECT * FROM employees;
emp employees%ROWTYPE;
table_exists number;
BEGIN
SELECT COUNT(*) INTO table_exists FROM user_tables WHERE table_name = 'EMPDETAILS';--return if table exists or not
IF table_exists = 0 THEN
EXECUTE IMMEDIATE 'CREATE TABLE empdetails AS (SELECT * FROM employees)';
END IF;
OPEN c;
LOOP
FETCH c INTO emp;
EXIT WHEN c%NOTFOUND;
END LOOP;
CLOSE c;
dbms_output.put_line('EMPLOYEE_ID      FIRST_NAME   LAST_NAME    EMAIL                   PHONE_NUMBER   HIRE_DATE   JOB_ID     SALARY       COMMISSION   MANAGER_ID  DEPARTMENT_ID');
dbms_output.put_line('-----------      ------------ ------------ ----------------------- -------------- ----------- ---------- ------------ ------------ ----------- -------------');
FOR i IN c LOOP
dbms_output.put_line(TO_CHAR(i.employee_id, '99999') || ' ' ||RPAD(i.first_name, 15) || ' ' ||RPAD(i.last_name, 15) || ' ' ||RPAD(i.email, 25) || ' ' ||RPAD(i.phone_number, 15) || ' ' ||TO_CHAR(i.hire_date, 'YYYY-MM-DD') || ' ' ||RPAD(i.job_id, 10) || ' ' ||TO_CHAR(i.salary, '999999.99') || ' ' ||NVL(TO_CHAR(i.commission_pct, '0.99'),'NULL') || ' ' ||NVL(TO_CHAR(i.manager_id, '99999'),'NULL') || ' ' ||TO_CHAR(i.department_id, '99999'));
END LOOP;
END;
/
