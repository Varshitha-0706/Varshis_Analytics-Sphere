CREATE DATABASE SAMPLE;
USE SAMPLE;
CREATE TABLE EMPS (
 employee_id numeric(10) PRIMARY KEY,
 first_name VARCHAR(20) unique,
 last_name VARCHAR(20),
 salary numeric(10),
 hire_date DATE
);
INSERT INTO EMPS(employee_id,first_name,last_name,salary,hire_date) VALUES
(0,"scdvfh","sdvfsd",456,"2023-8-3"),
(1,null,"WDdEFG",45,"2024-4-4"),
(3,"JHGVGdHI","DFGRFDS",34,"2020-3-3"),
(20,"scdvssjh","jhgfghj",98,"2020-5-5"),
(13,null,"WDEsFG",45,"2024-4-4");
select* from EMPS order by field(employee_id,0,1,3,20,13,2,4,8,9,10);
select employee_id,NULLIF(first_name,"scdvssjh") as firstname from EMPS;
SELECT * FROM EMPS WHERE first_name IS NOT NULL;
SELECT * FROM EMPS WHERE first_name IS NULL;
SELECT COUNT(first_name) AS COUNT FROM EMPS;
--  NO.OF FIRSTNAMES WITHOUT NULL(IGNORES NULL)
SELECT COUNT(*) AS COUNT FROM EMPS;
-- COUNTS ALL ROWS(ENTITIES) INCLUDING NULL VALUES..
SELECT employee_id, last_name, COUNT(first_name) AS first_name_count FROM EMPS
GROUP BY employee_id, last_name;
SELECT employee_id, last_name, COUNT(*) AS first_name_count FROM EMPS
GROUP BY employee_id, last_name;
SELECT employee_id, last_name,first_name, COUNT(first_name) AS first_name_count FROM EMPS
GROUP BY employee_id, last_name,first_name;


