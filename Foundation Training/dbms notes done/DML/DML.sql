#removing safe-update
SET SQL_SAFE_UPDATES=0;

show databases;

use person;

show tables;

describe student;

select * from person;
select * from student;


#Inserting Data


describe student;


INSERT INTO student(id,name,age) VALUES (101,"James",25);

#sincle I have made my id as auto_increment
INSERT INTO student(name,age) VALUES ("Jacob",21);

INSERT INTO student(name,age) VALUES("Maya",21);

INSERT INTO student(name) VALUES ("Sanjay");

INSERT INTO student VALUES(105,"Ron",21,"Hi I am RON");



INSERT INTO student SET name="Ritu", age=22;





#Retrieval of Data

select * from person;

select * from student;

#only want to view the name of the students

select name, age from student;

#Querying Syntax:

select * from student;

# Query to view only those student whose age is >= 22

select * from student where age>=22;




#Column ALiasing

select * from student;

select count(*) as student_count from student;

select count(*) as "student count" from student;

#Query to display the name and age in a single column for id>102 and age is not null

select concat(name," ",age) as "Name And Age" from student where id>102 and age IS NOT NULL;





#table aliasing:

select * from person;
select * from student;


#Two different tables

SELECT * FROM student s, person p where s.name=p.name;



SELECT s.id AS "Student Id", p.name AS "PersonName", s.age AS "Student Age" FROM student s, person p where s.name=p.name and s.age is not null;


# Two instances of same table

SELECT * FROM student s1, student s2 WHERE s1.id=s2.id;




#Updation

Select * from student;

#Update my age to 27 for student with id 101

UPDATE student SET age=27 WHERE id=101;

#Update the age=18 where ever it is null

UPDATE student SET age=18 where age is null;

#Update the text="Hello World" where ever it is = "text"


#Not a good practice to write '=' with String in WHERE clause
UPDATE student SET text="Hello World" WHERE text="text";

#Good Practice
UPDATE student SET text="Hello WORLD" WHERE text LIKE "text";


Select * from student;

#update my name="Jacobs" where name="Jacob"

UPDATE student s SET s.name="Jacobs" WHERE s.name LIKE "Jacob";

#Update my all my text-fields to text="Bye"

UPDATE student SET text="Bye!!";








#Deletion

Select * from student;

#delete student with id 106

DELETE FROM student WHERE id=106;


#delete student with name="Jacobs"

DELETE FROM student WHERE name LIKE "Jacobs";


#delete student with age=21;

DELETE FROM student WHERE age=21;

DELETE FROM student s WHERE s.age=21;


#Delete all the rows at once

DELETE FROM student;












