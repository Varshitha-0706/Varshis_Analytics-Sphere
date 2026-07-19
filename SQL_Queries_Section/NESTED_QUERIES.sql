create database nestedqueries;
use nestedqueries;
create table adventures(
id int,
name varchar(50),
city varchar(30)
);
insert into students(id,name,city) values
(100,"skydiving","dubai"),
(101,"zipline","rishikesh"),
(102,"bujee jumping","manali"),
(103,"scubadiving","maldive"),
(104,"trecking","ladekh"),
(105,"bike riding","leh ladakh");
create table rates(
name varchar(50),
rates int,
no_of_members int
);
insert into rates(name,rates,no_of_members) values
("skydiving",20,000,10),
("zipline",30,00,5),
("bujee jumping",200,1),
("scubadiving",500,2),
("trecking",300,4),
("bike riding",10,2);





