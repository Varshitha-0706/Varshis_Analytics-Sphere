-- DB:employee
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName NVARCHAR(50),
    LastName NVARCHAR(50),
    Email NVARCHAR(100) UNIQUE,
    DepartmentID INT,
    HireDate DATE,
    Salary DECIMAL(10, 2)
);


INSERT INTO Employees (EmployeeID, FirstName, LastName, Email, DepartmentID, HireDate, Salary)
VALUES 
(1, 'John', 'Smith', 'john.smith@example.com', 101, '2021-06-15', 75000.00),
(2, 'Jane', 'Doe', 'jane.doe@example.com', 102, '2020-03-10', 85000.00),
(3, 'Michael', 'Johnson', 'michael.johnson@example.com', 101, '2019-11-22', 95000.00),
(4, 'Emily', 'Davis', 'emily.davis@example.com', 103, '2022-01-05', 68000.00),
(5, 'William', 'Brown', 'william.brown@example.com', 102, '2018-07-19', 80000.00);
select * from Employees

--1)Write a SQL query to find the names of employees who have a salary higher than the average salary of all employees.
select FirstName,LastName from Employees where Salary>(select AVG(Salary)[AVG_salary] from Employees)

--2)Write a SQL query to list the employee names and their departments for employees who were hired after the oldest employee in the company.
select FirstName,LastName,DepartmentID from Employees where HireDate>(select MIN(HireDate) from Employees)

--3)Write a SQL query to find the details of the employee(s) with the highest salary.
select *from Employees where Salary=(select MAX(Salary) from Employees)

--4)Write a SQL query to find the names of employees who work in the same department as 'John Smith'.
select FirstName,LastName from Employees where DepartmentID in (select DepartmentID from Employees where CONCAT(FirstName,' ',LastName)='John Smith')
AND CONCAT(FirstName, ' ', LastName) <> 'John Smith';

--5)Write a SQL query to find the names of employees who do not belong to the department with the highest average salary.
SELECT FirstName, LastName
FROM Employees
WHERE DepartmentID NOT IN (
    SELECT DepartmentID
    FROM Employees
    GROUP BY DepartmentID
    HAVING AVG(Salary) = (
        SELECT MAX(avg_salary)
        FROM (
            SELECT AVG(Salary) AS avg_salary
            FROM Employees
            GROUP BY DepartmentID
        ) t
    )
)


--6)Write a SQL query to find the names of employees whose first names start with the letter 'J'.
select FirstName,LastName from Employees where FirstName like 'J%'

--7)Write a SQL query to find the names of employees whose last names end with the letter 'n'.
select FirstName,LastName from Employees where LastName like '%n'

--8)Write a SQL query to find the email addresses of employees that contain the word "john".
select Email from Employees where Email like '%john%'

--9)Write a SQL query to find the names of employees whose first names have exactly 5 characters.
select FirstName,LastName from Employees where FirstName like '_____'

--10)Write a SQL query to find the names of employees whose last names contain the letter 'a' as the second character.
select FirstName,LastName from Employees where LastName like '_a%'
