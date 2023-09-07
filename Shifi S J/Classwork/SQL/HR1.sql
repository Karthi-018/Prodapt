CREATE TABLE job_grades (
grade CHAR(1),
lowest_sal NUMBER(8,2) NOT NULL,
highest_sal NUMBER(8,2) NOT NULL
);

ALTER TABLE job_grades
ADD CONSTRAINT jobgrades_grade_pk PRIMARY KEY (grade);

INSERT INTO job_grades VALUES ('A', 1000, 2999);
INSERT INTO job_grades VALUES ('B', 3000, 5999);
INSERT INTO job_grades VALUES ('C', 6000, 9999);
commit;

INSERT INTO job_grades VALUES ('D', 10000, 14999);
savepoint s1;
rollback s1;    //deleted this row

select * from job_grades;

INSERT INTO job_grades VALUES ('E', 15000, 24999);
INSERT INTO job_grades VALUES ('F', 25000, 40000);
savepoint s2;
rollback s2;   //deleted these two rows,displays only commited insertions

INSERT INTO job_grades VALUES ('G', 29900, 28888);

SAVEPOINT s3;
select * from job_grades; //gives 4rows A,B,C,G
rollback s3; //gives three only

INSERT INTO job_grades VALUES ('I', 293838, 337373);
commit;
rollback;
select * from job_grades;//gives 4 rows(A,B,C,I)




select * from employees;