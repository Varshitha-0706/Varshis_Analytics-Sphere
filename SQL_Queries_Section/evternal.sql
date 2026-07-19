create database lab;
use lab;
create table Books(
id INT PRIMARY KEY,
Genre VARCHAR(20)
);
INSERT INTO Books(id,Genre) values
(1,'Adventures'),
(2,'Comedy'),
(3,'Horrer'),
(4,'Stories');
select *from Books;
update Books
set Genre='Mystery' where id=3;
select *from Books;

create table booky(
id int primary key,
genre_name varchar(200),
Book_Title varchar(50),
Publication_year YEAR
);
INSERT INTO booky(id,genre_name,Book_Title,Publication_year) values
(1,'Adventures','beauty and the beast','2022'),
(2,'Comedy','motu patlu','2020'),
(3,'Mystery','the princess','2024'),
(4,'Adventures','the raman','2023'),
(5,'Mystery','lion and king','2021'),
(6,'Comedy','doraemon','2023'),
(7,'Mystery','The jungel book','2023'),
(8,'Comedy','jigglepuff','2022');
select *from booky;
select genre_name,Book_Title,Publication_year from booky
where Publication_year>=2022 order by genre_name;

-- ...EXTERNAL...
create table Employees( 
employee_id INT PRIMARY KEY,
department_name varchar(30),
salary int
);
insert into Employees(employee_id,department_name,salary) values
(1,'finance',70000),
(2,'operations',80000),
(3,'finance',60000),
(4,'marketting',75000);
select *from Employees;
select department_name,avg(salary) as avg_salary,count(employee_id) as employee_count from Employees
GROUP BY department_name;
 
create table employee(
Employee_ID INT PRIMARY KEY,
Name varchar(20),
salary int);
insert into employee(Employee_ID,Name,salary) values
(201,'Rana Bahadur',5200),
(202,'Prithviraj',6000),
(203,'Chandragupta',7000);
select *from employee;
start transaction;
update employee set salary =5500
where Name='Rana Bahadur';
select *from employee;
savepoint sp1;
update employee set salary =6500
where Name='Prithviraj';
select *from employee;
rollback to sp1;
select *from employee;






