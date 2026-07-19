
select *from Employees -- DB:EMPLOYEE
--1)Write a SQL query to select all columns and rows from the Employees table.
select *from Employees

--2)Write a SQL query to find the names and email addresses of all employees who work in the department with DepartmentID = 101.
select FirstName,LastName,Email from Employees where DepartmentID=101

--3)Write a SQL query to find the total number of employees in the Employees table.
select count(EmployeeID)[Total_Employees] from Employees

--4)Write a SQL query to find the details of employees who were hired in the year 2020.
select *from Employees where YEAR(HireDate)=2020

--5)Write a SQL query to update the salary of 'Jane Doe' to 90,000.
UPDATE Employees SET Salary=90000 WHERE CONCAT(FirstName,' ',LastName)='Jane Doe'
select FirstName,LastName,Salary from Employees where Salary=90000
----------------------------------------------------------------------------------
--------------------IMPORTANT INTERVIEW QUESTIONS---------------------------------
-- 2ND HIGHEST SALALRY
select max(salary) [2nd highest salary] from Employees where salary<(select max(salary) from Employees)
-- 3RD HIGHEST SALARY
select max(salary)[3rd highest salary] from Employees where salary<(select max(salary) from Employees where salary<(select max(salary) from Employees))
-- CTE  (2nd HIGHEST SALARY)
with cte as (
select *,DENSE_RANK() over(order by salary desc) [DR] from Employees
)
select salary [2nd highest salary] from cte where DR=2
-- CTE  (3rd HIGHEST SALARY)
with cte as (
select *,DENSE_RANK() over(order by salary desc) [DR] from Employees
)
select salary [3rd highest salary] from cte where DR=3

-- SUBQUERY WITH DENSE_RANK()     2nd HIGHEST SALALRY
select salary [2nd highest salary] from 
(select *,DENSE_RANK() over(order by salary desc) [DR] from Employees) x -- name x for sunquery
where DR=2 
-- TOP
select top 1 salary [2nd highest salary] from
(select distinct top 2 salary from Employees order by salary desc) x -- distinct is mandatory becoz same salary can occur
order by salary asc
----------------------------------------------------------------------------
CREATE TABLE ReportingStructure (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(100),
    ManagerID INT
);
INSERT INTO ReportingStructure (EmployeeID, EmployeeName, ManagerID) VALUES
(1, 'Alice Smith', NULL),  -- Alice Smith is at the top and reports to no one
(2, 'Bob Johnson', 1),     -- Bob Johnson reports to Alice Smith
(3, 'Carol White', 1),     -- Carol White reports to Alice Smith
(4, 'David Brown', 2),     -- David Brown reports to Bob Johnson
(5, 'Eve Davis', 2),       -- Eve Davis reports to Bob Johnson
(6, 'Frank Miller', 3);    -- Frank Miller reports to Carol White
select *from ReportingStructure

SELECT A.EmployeeName [Manager],B.EmployeeName [Reportee]
from ReportingStructure A inner join reportingstructure B 
on A.EmployeeID=B.ManagerID
-- also want alice who he reports to
union all
select EmployeeName,null [Manager] from ReportingStructure WHERE ManagerID is null
--------------------------------------------------------------------------------------
CREATE TABLE EmployeeRecords (
    EmployeeID INT,
    EmployeeName VARCHAR(100),
    ManagerID INT
);
INSERT INTO EmployeeRecords (EmployeeID, EmployeeName, ManagerID) VALUES
(1, 'Alice Smith', NULL),
(2, 'Bob Johnson', 1),
(3, 'Carol White', 1),
(4, 'David Brown', 2),
(5, 'Eve Davis', 2),
(6, 'Frank Miller', 3),
(2, 'Bob Johnson', 1),  -- Duplicate entry
(4, 'David Brown', 2);  -- Duplicate entry
select *from EmployeeRecords order by EmployeeID,EmployeeName,ManagerID
SELECT *into Emprecords_backup from EmployeeRecords
-- 1st WAY TO DELETE
with cte as (
select *,ROW_NUMBER() over(partition by EmployeeID,EmployeeName,ManagerID order by EmployeeID) [ROW_NO] from EmployeeRecords)
delete from cte where [ROW_NO] =2
select *from EmployeeRecords
-- 2ND WAY TO DELETE
select distinct *into #1 from Emprecords_backup 
truncate table Emprecords_backup
--select *into Emprecords_backup from #1 (already table present gves error)
insert into Emprecords_backup select *from #1
select *from Emprecords_backup

----------------------------------------------------------------------------

CREATE TABLE EmployeeRecords_1 (
    EmployeeID INT,
    Email VARCHAR(100)
);
INSERT INTO EmployeeRecords_1 (EmployeeID, Email) VALUES
(1, 'alice@example.com'),
(2, 'bob@example.com'),
(3, 'carol@example.com'),
(4, 'david@example.com'),
(2, 'bob@example.com'),        -- Duplicate entry (same EmployeeID and Email)
(4, 'david@example.com'),      -- Duplicate entry (same EmployeeID and Email)
(5, 'shared@example.com'),     -- Valid case: Same email, different EmployeeID
(6, 'shared@example.com');     -- Valid case: Same email, different EmployeeID
SELECT *FROM EmployeeRecords_1 order by EmployeeID,email
select distinct *into #2 from EmployeeRecords_1
truncate table EmployeeRecords_1
INSERT into EmployeeRecords_1 select *from #2
select *from EmployeeRecords_1
with cte as(
select *,DENSE_RANK() over(partition by Email order by EmployeeID) [DR] from EmployeeRecords_1)
--select *from cte
DELETE from cte where [DR] =2  -- to run this select from with cte to this and have to comment select *from cte 

--- RETAI THE RECORD WITH HIGHER EMPLOYEE ID
select *into EmployeeRecords_2 from #2
select *from EmployeeRecords_2 order by Email

with cte as(
select *,DENSE_RANK() over(partition by Email order by EmployeeID desc) [DR] from EmployeeRecords_2)
--select *from cte
DELETE from cte where [DR]=2
SELECT *FROM EmployeeRecords_2  -- 6 REMAINED 
SELECT *FROM EmployeeRecords_1  -- 5 REMAINED