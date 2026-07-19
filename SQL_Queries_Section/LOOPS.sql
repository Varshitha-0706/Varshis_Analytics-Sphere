DELIMITER //
CREATE PROCEDURE print()
BEGIN
declare i integer;
set i=1;
--  DECLARE i INT DEFAULT 1;
printing:loop
select i;
set i=i+1;
if (i>5) THEN
LEAVE printing;
end if;
end loop printing;
END//
DELIMITER ;
CALL print();
/* DELIMITER // and DELIMITER ;: The DELIMITER is used to change the statement delimiter temporarily to // 
(so the semicolons within the procedure do not end the entire statement prematurely).
After defining the procedure,we reset the delimiter back to the default semicolon ;Running t*/

-- you can achieve a nested loop using a combination of WHILE loops 
-- (since MySQL doesn't have a FOR loop like PL/SQL does)
DELIMITER //
CREATE PROCEDURE for_loop()
BEGIN
declare i integer default 1;
declare j integer default 1;
while i<=3 do
set j=1;
-- Reset j for each iteration of the outer loop
while j<=3 do
select CONCAT('i is ', i, ' and j is ', j);
set j=j+1;
end while;
set i=i+1;
end while;
end //
delimiter ;
call for_loop();
-- DROP PROCEDURE [IF EXISTS] procedure_name;
-- IF EXISTS: This is optional. It prevents an error if the procedure does not exist.
-- If you are unsure whether the procedure exists, it is a good practice to include IF EXISTS
DROP PROCEDURE IF EXISTS forloop;
-- FACTORIAL OF A NUMBER..
DELIMITER //
CREATE PROCEDURE factorial(IN x integer)
begin 
declare fact int default 1;
declare temp integer;
set temp=x;
while temp>0 do
set fact=fact*temp;
set temp=temp-1;
end while;
select concat('The factorial of ',x,' is ',fact);
end//
delimiter ;
call factorial(10);
drop procedure factorial;




