CREATE DATABASE class;
use class;
CREATE TABLE STUDENTDETAILS(
Id int primary key AUTO_INCREMENT,
name varchar(30) NOT NULL,
Dept varchar(100) NOT NULL,
year YEAR DEFAULT '2020',
Cgpa FLOAT
);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (1, 'Alice Smith', 'Computer Sci', 2020, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (2, 'Bob Johnson', 'Physics', 2020, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (3, 'Carol White', 'Chemistry', 2024, 3.2);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (4, 'David Brown', 'Mathematics', 2000, 3.9);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (5, 'Eva Green', 'Computer Sci', 2000, 3.6);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (6, 'Frank Black', 'Biology', 2000, 3.4);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (7, 'Grace Lee', 'Computer Sci', 2023, 3.7);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (8, 'Henry Davis', 'Engineering', 2023, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (9, 'Isla Moore', 'Mathematics', 2022, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (10, 'Jack Taylor', 'Physics', 2022, 3.3);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (11, 'Kelly White', 'Chemistry', 2023, 3.6);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (12, 'Liam Martin', 'Biology', 2024, 3.9);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (13, 'Mia Clark', 'Computer Sci', 2001, 3.7);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (14, 'Noah Lewis', 'Engineering', 2002, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (15, 'Olivia Hall', 'Mathematics', 2003, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (16, 'Paul Allen', 'Physics', 2004, 3.4);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (17, 'Quinn Young', 'Chemistry', 2001, 3.6);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (18, 'Ryan King', 'Biology', 2002, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (19, 'Sophia Scott', 'Computer Sci', 2023, 3.9);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (20, 'Tom Hernandez', 'Engineering', 2020, 3.3);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (21, 'Uma Patel', 'Mathematics', 2001, 3.4);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (22, 'Victor Garcia', 'Physics', 2020, 3.7);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (23, 'Wendy Lopez', 'Chemistry', 2020, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (24, 'Xavier Green', 'Biology', 2019, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (25, 'Yara Carter', 'Computer Sci', 2019, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (26, 'Zachary Hill', 'Engineering', 2019, 3.6);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (27, 'Ava Robinson', 'Mathematics', 2018, 3.9);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (28, 'Benjamin Lee', 'Physics', 2018, 3.4);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (29, 'Chloe Adams', 'Chemistry', 2017, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (30, 'Daniel Wilson', 'Biology', 2015, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (31, 'Ella Thompson', 'Computer Sci', 2015, 3.6);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (32, 'Felix Martinez', 'Engineering', 2001, 3.9);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (33, 'Grace Parker', 'Mathematics', 2001, 3.7);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (34, 'Henry Cooper', 'Physics',2002, 3.4);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (35, 'Isabella Mitchell', 'Chemistry', 2015, 3.5);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (36, 'James Turner', 'Biology', 2020, 3.6);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (37, 'Kira Foster', 'Computer Sci', 2016, 3.9);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (38, 'Liam Rivera', 'Engineering', 2018, 3.8);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (39, 'Mia Gonzalez', 'Mathematics', 2023, 3.4);
INSERT INTO STUDENTDETAILS (id, name, dept, year, cgpa) VALUES (40, 'Noah Edwards', 'Physics', 2018, 3.7);
select *from STUDENTDETAILS;
SELECT *FROM STUDENTDETAILS ORDER BY cgpa;
-- display details order by cgpa in each department 
SELECT *FROM STUDENTDETAILS GROUP BY dept ORDER BY cgpa;
SELECT dept,avg(cgpa) as avg_cgpa from STUDENTDETAILS GROUP BY dept order by avg(cgpa) desc;
-- min
SELECT dept,max(cgpa) as max_cgpa from STUDENTDETAILS GROUP BY dept order by max(cgpa) desc;
SELECT dept,min(cgpa) as min_cgpa from STUDENTDETAILS GROUP BY dept order by min(cgpa);
