
create database [Profit DB]
use [profit db]

-- Create a table to store monthly profit data for different products
CREATE  TABLE ProfitData (
    MonthNumber INT,
    MonthName VARCHAR(3),
    Product VARCHAR(50),
    Profit INT
);

-- Insert data into the ProfitData table
INSERT INTO ProfitData (MonthNumber, MonthName, Product, Profit) VALUES
(1, 'Jan', 'Product A', 1000),
(2, 'Feb', 'Product A', 1500),
(3, 'Mar', 'Product A', 1200),
(4, 'Apr', 'Product A', 1700),
(5, 'May', 'Product A', 1300),
(6, 'Jun', 'Product A', 1600),
(1, 'Jan', 'Product B', 2000),
(2, 'Feb', 'Product B', 2500),
(3, 'Mar', 'Product B', 2200),
(4, 'Apr', 'Product B', 2700),
(5, 'May', 'Product B', 2300),
(6, 'Jun', 'Product B', 2600);

select *from ProfitData
--WINDOW FUCTION:LEAD FUNCTION
-- add a column that shows next month's profit for each product
select *,lead(profit) over(partition by Product order by MonthNumber) [Next_month_profit]
from ProfitData

-- we dont want product column but we want each month's total profit to be shown with monthnumber,monthname
-- also add next month's total profit column
select MonthNumber,MonthName,sum(profit) [Total_Profit],
lead(sum(profit)) over(order by MonthNumber) [Next_month_Total_profit]
from ProfitData
group by MonthNumber,MonthName
order by MonthNumber
---------------------------------------------------------------------------
--WINDOW FUCTION:LAG FUNCTION
select *from ProfitData
-- add a column that shows previous month's profit for each product
select *,lag(profit) over(partition by Product order by MonthNumber) [Previous_month_profit]
from ProfitData

------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    PhoneNumber VARCHAR(20),
    Address VARCHAR(255)
);


INSERT INTO Customers (CustomerID, FirstName, LastName, Email, PhoneNumber, Address)
VALUES
(1, 'Alice', 'Johnson', 'alice.johnson@example.com', '555-1234', '123 Elm St'),
(2, 'Bob', 'Smith', NULL, '555-5678', NULL),
(3, 'Charlie', 'Williams', 'charlie.williams@example.com', NULL, '456 Oak St'),
(4, 'Diana', 'Brown', NULL, NULL, '789 Pine St'),
(5, 'Eve', 'Davis', 'eve.davis@example.com', '555-8765', NULL);
select *from Customers
-- ISNULL
select isnull(null,'value null')
select('abc',null)
select(null,null)
--If 1st value is null ,2nd value is printed otherwise 1st value is printed...

-- COALESCE
-- return 1st non-null value in the set of values provided(many can take)
SELECT coalesce('a','b','c')
select coalesce(null,'b','c')
select coalesce(null,null,'c')
select CustomerID,isnull(email,'Email NA'),isnull(PhoneNumber,'Phone no NA') from Customers
select CustomerID,coalesce(email,PhoneNumber,'Contact not available') [Coalesce Function] from Customers
-------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------
CREATE TABLE EmployeeSalaries (
    EmployeeID INT,
    EmployeeName VARCHAR(50),
    Salary INT,
    Department VARCHAR(50)
);


INSERT INTO EmployeeSalaries (EmployeeID, EmployeeName, Salary, Department)
VALUES
(1, 'Alice', 50000, 'HR'),
(2, 'Bob', 60000, 'HR'),
(3, 'Charlie', 55000, 'HR'),
(4, 'David', 75000, 'Finance'),
(5, 'Eve', 80000, 'Finance'),
(6, 'Frank', 72000, 'Finance'),
(7, 'Grace', 90000, 'IT'),
(8, 'Heidi', 95000, 'IT'),
(9, 'Ivan', 87000, 'IT');
select *from EmployeeSalaries
-- FIRST_VALUE()
select *
,FIRST_VALUE(Salary) over(order by salary asc) [Minimum Salary]
from EmployeeSalaries

select *
,FIRST_VALUE(EmployeeName) over(order by salary asc) [Emp with Minimum Salary]
,FIRST_VALUE(Salary) over(order by salary asc) [Minimum Salary]
from EmployeeSalaries


select * 
,FIRST_VALUE(EmployeeID) over(partition by department order by salary) [First Value]
from EmployeeSalaries

select * 
,FIRST_VALUE(EmployeeID) over(partition by department order by salary desc) [First Value EID]
,FIRST_VALUE(EmployeeName) over(partition by department order by salary desc) [First Value EName]
from EmployeeSalaries
-------------------------------------------------------------------------------------------------
-- LAST_VALUE()

select * from EmployeeSalaries

--Incorrect Query
select * 
,LAST_VALUE(EmployeeName) over(order by salary desc) [Emp with Lowest Salary]
from EmployeeSalaries

--correct Query
select * 
,LAST_VALUE(EmployeeName) over(order by salary desc rows between unbounded preceding and unbounded following) [Emp with Lowest Salary]
from EmployeeSalaries

--correct Query
select * 
,LAST_VALUE(EmployeeName) over(order by salary desc rows between unbounded preceding and unbounded following) [Emp with Lowest Salary]
,LAST_VALUE(Salary) over(order by salary desc rows between unbounded preceding and unbounded following) [Lowest Salary]
from EmployeeSalaries

--correct Query
select * 
,LAST_VALUE(EmployeeName) over(partition by department
order by salary desc rows between unbounded preceding and unbounded following) [Emp with Lowest Salary]

,LAST_VALUE(Salary) over(partition by department order by salary desc rows between unbounded preceding and unbounded following) [Lowest Salary]
from EmployeeSalaries

--correct Query [Last Value Window Fun]
select * 
,LAST_VALUE(EmployeeName) over(partition by department
order by salary rows between unbounded preceding and unbounded following) [Emp with Highest Salary]

,LAST_VALUE(Salary) over(partition by department order by salary asc rows between unbounded preceding and unbounded following) [Highest Salary]
from EmployeeSalaries

--correct Query [First Value Window Fun]
select * 
,first_VALUE(EmployeeName) over(partition by department
order by salary desc) [Emp with Highest Salary]

,first_VALUE(Salary) over(partition by department order by salary desc) [Highest Salary]
from EmployeeSalaries
