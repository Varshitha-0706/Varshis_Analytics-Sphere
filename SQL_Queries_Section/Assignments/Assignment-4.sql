-- DB:Employee
-- Creating the Departments table
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName NVARCHAR(100)
);

-- Inserting data into the Departments table
INSERT INTO Departments (DepartmentID, DepartmentName)
VALUES
(101, 'Human Resources'),
(102, 'Finance'),
(103, 'IT');
select *from Employees;
select *from Departments;

--1)Write a SQL query to list the names of employees along with the names of the departments they work in.
select FirstName,LastName,d.DepartmentName from Employees e inner join Departments d on e.DepartmentID=d.DepartmentID

--2)Write a SQL query to list all the departments and the employees working in them, including departments with no employees.
select DepartmentName,FirstName,LastName from Departments d left join Employees e on e.DepartmentID=d.DepartmentID

--3)Write a SQL query to find the names of employees who do not belong to any department (i.e., no matching department ID).
select FirstName,LastName from Employees e left join Departments d on e.DepartmentID=d.DepartmentID where d.DepartmentID is null

--4)Write a SQL query to list the names of employees who work in the same department as 'Jane Doe'.
SELECT e.FirstName, e.LastName
FROM Employees e
WHERE e.DepartmentID = (
    SELECT DepartmentID
    FROM Employees
    WHERE FirstName = 'Jane' AND LastName = 'Doe'
)
AND NOT (e.FirstName = 'Jane' AND e.LastName = 'Doe');

 -- TO NOT PRINT JANE DOE
-- <> IS NOT EQUAL TO

--5)Write a SQL query to find the department with the highest total salary paid to its employees.
SELECT d.DepartmentName, SUM(e.Salary) AS Total_Salary
FROM Employees e
JOIN Departments d
ON e.DepartmentID = d.DepartmentID
GROUP BY d.DepartmentName
HAVING SUM(e.Salary) = (
    SELECT MAX(total_salary)
    FROM (
        SELECT SUM(Salary) AS total_salary
        FROM Employees
        GROUP BY DepartmentID
    ) t
);
