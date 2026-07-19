CREATE DATABASE VIEWS;
Use VIEWS;
-- 	QUESTION->1: Fromthefollowingtable,createaviewforthosesalespeoplewhobelongtothecityofNewYorkandinsertnew
 -- SalespersonintothenewYorkcityusingthecreatedview.
CREATE TABLE SALESPEOPLE(
salesman_id int primary key,
name varchar(50) NOT NULL,
city varchar(30),
commission float
);
Insert into salespeople(salesman_id,name,city,commission) VALUES(5001,"James Hoog","New York",0.15);
Insert into salespeople(salesman_id,name,city,commission) VALUES(5002,"Nail Knite","Paris",0.13);
Insert into salespeople(salesman_id,name,city,commission) VALUES(5005,"Pit Alex","London",0.11);
Insert into salespeople(salesman_id,name,city,commission) VALUES(5006,"James Hoog","Paris",0.14);
Insert into salespeople(salesman_id,name,city,commission) VALUES(5007,"Paul Adam","Rome",0.13);
Insert into salespeople(salesman_id,name,city,commission) VALUES(5003,"Lauson Hen","San Jose",0.12);
select *from SALESPEOPLE;
CREATE VIEW Newsales AS SELECT salesman_id,name,city,commission from SALESPEOPLE WHERE city="New York";
select *from Newsales;
INSERT INTO Newsales(salesman_id,name,city,commission) VALUES(5004,"Varshini","New York",0.17);
select *from Newsales;
UPDATE Newsales SET name="varshitha" where city="New York";
select* from Newsales;
/*QUESTION->2:Fromthefollowingtable,create a view that countS the number of customers in each
 grade. And update the view by adding a column(phonenumber).*/
CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    cust_name VARCHAR(100),
    city VARCHAR(100),
    grade INT,
    salesman_id INT
);
INSERT INTO customer (customer_id, cust_name, city, grade, salesman_id) VALUES
(3002, 'Nick Rimando', 'New York', 100, 5001),
(3007, 'Brad Davis', 'New York', 200, 5001),
(3005, 'Graham Zusi', 'California', 200, 5002),
(3008, 'Julian Green', 'London', 300, 5002),
(3004, 'Fabian Johnson', 'Paris', 300, 5006),
(3009, 'Geoff Cameron', 'Berlin', 100, 5003),
(3003, 'Jozy Altidor', 'Moscow', 200, 5007),
(3001, 'Brad Guzan', 'London', NULL, 5005);
select *from customer;
SELECT * FROM customer
ORDER BY FIELD(customer_id, 3002, 3007, 3005, 3008, 3004, 3009, 3003, 3001);
CREATE VIEW customerbygrade AS SELECT grade,COUNT(customer_id) AS customercount from customer GROUP BY grade;
SELECT *from customerbygrade;
-- DROP VIEW IF EXISTS customerbygrade;
/* QUESTION->3: Fromtheabove tables,createaviewtogetthesalespersonandcustomerbyname.Returnordername,purchase
 amount,salespersonID,name,customername.(useabovetablessalesmanandcustomertablealongwithorders)
 Sampleorders table:*/
CREATE TABLE orders (
    ord_no INT PRIMARY KEY,
    purch_amt DECIMAL(10, 2),
    ord_date DATE,
    customer_id INT,
    salesman_id INT REFERENCES SALESPEOPLE(salesman_id)
);
INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES
(70001, 150.50, '2012-10-05', 3005, 5002),
(70009, 270.65, '2012-09-10', 3001, 5005),
(70002, 65.26, '2012-10-05', 3002, 5001),
(70004, 110.50, '2012-08-17', 3009, 5003),
(70007, 948.50, '2012-09-10', 3005, 5002),
(70005, 2400.60, '2012-07-27', 3007, 5001),
(70008, 5760.00, '2012-09-10', 3002, 5001),
(70010, 1983.43, '2012-10-10', 3004, 5006),
(70003, 2480.40, '2012-10-10', 3009, 5003),
(70012, 250.45, '2012-06-27', 3008, 5002),
(70011, 75.29, '2012-08-17', 3003, 5007),
(70013, 3045.60, '2012-04-25', 3002, 5001);
SELECT *FROM orders;
CREATE VIEW sales_view AS
SELECT 
    o.ord_no AS order_name,
    o.purch_amt AS purchase_amount,
    o.salesman_id,
    s.name AS salesperson_name,
    c.cust_name AS customer_name
FROM 
    orders o
JOIN 
    salespeople s ON o.salesman_id = s.salesman_id
JOIN 
    customer c ON o.customer_id = c.customer_id;
    /*Explanation
SELECT Statement: This part selects the relevant columns:

ord_no from orders as order_name.
purch_amt from orders as purchase_amount.
salesman_id from orders.
name from salesman as salesperson_name.
name from customer as customer_name.
JOIN Operations: The view joins the orders table with the salesman and customer tables based on salesman_id and customer_id respectively.*/
SELECT * FROM sales_view;
/*QUESTION->4:create a view to find all the customers who have the highest grade.Return all the fields of
 customer.(usetheabovecustomertable).*/
 create view highest_grade_customer as select * from customer where grade=(SELECT MAX(grade) FROM customer);
select *from highest_grade_customer;
/* QUESTION->5:create a view to display the number of orders per day.Return order date and number of orders..
 (use the above orders table).*/
 CREATE VIEW VIEW_NO_OF_ORDERS AS SELECT COUNT(ord_no) AS NO_OF_ORDERS,ord_date from orders group by ord_date ORDER BY ord_date;
 select *from VIEW_NO_OF_ORDERS;
  CREATE VIEW VIEW_NO_OF_ORDERSS AS SELECT COUNT(ord_no) AS NO_OF_ORDERS,ord_date from orders group by ord_date ORDER BY NO_OF_ORDERS;
 select *from VIEW_NO_OF_ORDERSS;
 /* QUESTION->6:create a view to find the salespersons who issued orders on either August17th,2012 or October
 10th,2012.Return salespersonID,order number and customerID.(usetheabovetables).*/
 CREATE VIEW salespersons_by_date as select o.salesman_id,ord_no,customer_id from orders o where o.ord_date in ('2012-08-17','2012-10-10');
 select *from salespersons_by_date;
 /* QUESTION_>7:Create a view to display the orders of the day 2012-08-17.and insert a new order for the same date using view.
*/
CREATE VIEW order_on_date as select ord_no,purch_amt,ord_date,customer_id,salesman_id from orders where ord_date='2012-08-17';
select *from order_on_date;
INSERT INTO order_on_date(ord_no,purch_amt,ord_date,customer_id,salesman_id) 
VALUES(10764,12.25,'2012-08-17',3003,5000);
select *from order_on_date;
/* QUESTION->8: Write a query to Check the actual tables(salesman,customerandorders)after inserting and updating of the views
 Whichwecreatedbytheabovequerys*/
 select *from salespeople;
 select *from customer;
 select *from orders;




