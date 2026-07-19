DELIMITER //
CREATE PROCEDURE say_hello()
BEGIN
    DECLARE msg VARCHAR(20);
    SET msg = 'hello world';
    SELECT msg;
END //
DELIMITER ;
CALL say_hello();
/* Explanation:
DELIMITER //: This is used to change the statement delimiter temporarily, so that we can create the stored procedure without conflicting with the default semicolon (;) delimiter.

CREATE PROCEDURE: MySQL uses stored procedures for grouping logic, and variable declarations typically happen inside such blocks.

DECLARE msg VARCHAR(20);: This declares the msg variable within the stored procedure.

SET msg = 'hello world';: In MySQL, you use SET to assign a value to a variable.

SELECT msg;: Instead of dbms_output.put_line() (which is used in Oracle), MySQL typically uses SELECT to output results.

DELIMITER ;: After defining the procedure, you reset the delimiter back to the default semicolon.*/
-- addition of 2 numbers
-- for taking input from user udse IN in PROCERDURE CREATION NAD DECLARE VARIABLES THERE ONLY AND 
-- WHILE CALLING PROCEDURE PASS THE VALUES RESPECTIVELY..
DELIMITER //
CREATE PROCEDURE addition(IN a integer,IN b integer)
begin
declare c integer;
set c=a+b;
SELECT c;
end//
DELIMITER ;
call addition(10,5); 
-- GREATEST NUMBERS FINDING..
delimiter //
create procedure greatest(IN a integer,IN b integer)
begin 
if(a>b) then
select "greatest number is a";
else
select "greatest number is b";
end if;
end//
delimiter ;
call greatest(10,50);


