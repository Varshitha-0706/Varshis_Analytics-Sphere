

CREATE TABLE Student_details (
    student_name VARCHAR(100),
    subject VARCHAR(100),
    marks INT
);

INSERT INTO Student_details (student_name, subject, marks)
VALUES 
-- Marks for Alice
('Alice', 'Math', 85),
('Alice', 'Science', 88),
('Alice', 'English', 92),

-- Marks for Bob
('Bob', 'Math', 90),
('Bob', 'Science', 78),
('Bob', 'English', 85),

-- Marks for Charlie
('Charlie', 'Math', 85),
('Charlie', 'Science', 82),
('Charlie', 'English', 80),

-- Marks for David
('David', 'Math', 92),
('David', 'Science', 91),
('David', 'English', 89),

-- Marks for Eve
('Eve', 'Math', 90),
('Eve', 'Science', 85),
('Eve', 'English', 87),

-- Marks for Frank
('Frank', 'Math', 75),
('Frank', 'Science', 72),
('Frank', 'English', 78),

-- Marks for Grace
('Grace', 'Math', 85),
('Grace', 'Science', 89),
('Grace', 'English', 90);

select *from Student_details

-- Row_Number
select *,ROW_NUMBER() over(order by marks desc) as [Row_number] from Student_details
--RANK()
-- If there's a tie,next ranks will be skipped.
select *,RANK() over(order by marks desc) as [Rank]
from Student_details
--DENSE_RANK()
-- If there's a tie,ranks will not be skipped.
select *,DENSE_RANK() over(order by marks desc) as [Rank]
from Student_details
------------------------------------------------------------
select *from Student_details
-- ROW_NUMBER WITH PARTITION
select *,ROW_NUMBER() over(partition by subject order by marks desc) as [Row_Number]
from Student_details -- order by is mandatory
-- RANK() WITH PARTITION
select *,RANK() over(partition by student_name order by marks desc) as [Row_Number]
from Student_details 
select *,RANK() over(partition by subject order by marks desc) as [Row_Number]
from Student_details 

-- DENSE_RANK() WITH PARTITION
select *,dense_rank() over(partition by subject order by marks desc) as [Row_Number]
from Student_details

