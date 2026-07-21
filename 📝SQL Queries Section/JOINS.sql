create database joins;
use joins;
CREATE TABLE Employee (
    Emp_id INT,
    Emp_name VARCHAR(50),
    Dept_id INT
);

INSERT INTO Employee (Emp_id, Emp_name, Dept_id) VALUES
(1, 'Ram', 10),
(2, 'Jon', 30),
(3, 'Bob', 50);
select *from Employee;	
CREATE TABLE Department (
    Dept_id INT,
    Dept_name VARCHAR(50)
);
select *from Department;
INSERT INTO Department (Dept_id, Dept_name) VALUES
(10, 'IT'),
(30, 'HR'),
(40, 'TIS');
-- INNER JOIN 
select Employee.Emp_id,Employee.Emp_name,Employee.Dept_id,Department.Dept_name
 FROM Employee
 INNER JOIN Department
 ON Employee.Dept_id = Department.Dept_id;
 -- old syntax:
 select Employee.Emp_id,Employee.Emp_name,Employee.Dept_id,Department.Dept_name
 FROM Employee,Department
Where Employee.Dept_id = Department.Dept_id;
-- LEFT OUTER JOIN OR LEFT JOIN
select Employee.Emp_id,Department.Dept_name
FROM Employee
LEFT OUTER JOIN Department
ON Employee.Dept_id = Department.Dept_id;
-- old syntax
/*select Employee.Emp_id,Department.Dept_name
FROM Employee,Department
WHERE Employee.Dept_id = Department.Dept_id(+);*/
-- RIGHT OUTER JOIN OR RIGHT JOIN 
select *
FROM Employee e
RIGHT OUTER JOIN Department
ON e.Dept_id = Department.Dept_id;
-- old syntax
/*select Employee.Emp_id,Department.Dept_name
FROM Employee,Department
WHERE Employee.Dept_id(+)= Department.Dept_id;*/
-- FULL JOIN(doesn't support) BUT CAN USE 
select *
FROM Employee e
LEFT JOIN Department
ON e.Dept_id = Department.Dept_id
UNION 
select *
FROM Employee e
RIGHT JOIN Department
ON e.Dept_id = Department.Dept_id;
-- NATURAL JOIN
select * from Employee natural join Department;
-- 
select Emp_id
FROM Employee e
UNION
select Dept_id
FROM Department;

select Emp_id
FROM Employee e
WHERE Emp_id<3
UNION
select Dept_id
FROM Department
where Dept_id=10;

select Emp_id
FROM Employee e
WHERE Emp_id<3
UNION
select Dept_id
FROM Department;

select Emp_id
FROM Employee e
WHERE Emp_id<3
UNION
select Dept_id
FROM Department
where Dept_id=10;
