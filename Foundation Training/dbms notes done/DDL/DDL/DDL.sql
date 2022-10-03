SET SQL_SAFE_UPDATES=0;


#DB-Related

show databases;

CREATE DATABASE sample_db;

USE sample_db;

DROP DATABASE sample_db;



#Create Table - Column Constraints
use DDL_BATCH_8; 

CREATE TABLE student(
student_id INT UNSIGNED NOT NULL,
name VARCHAR(20) NOT NULL,
major VARCHAR(15) NOT NULL,
grade VARCHAR(2)
);

describe student;



#Create Table - Table Constraints

CREATE TABLE employee_data(

employee_id INT NOT NULL,
aadhar VARCHAR(12) UNIQUE,
last_name VARCHAR(45) NOT NULL,
email VARCHAR(25),
salary DOUBLE(8,2),
commision_percentage DOUBLE(2,2),
hire_date DATE NOT NULL,

#ADDING Table-Constraints

CONSTRAINT emp_email_uk UNIQUE(email),
CONSTRAINT emp_id_pk PRIMARY KEY(employee_id)

);

describe employee_data;



CREATE TABLE sample(

sample_id INT NOT NULL UNIQUE PRIMARY KEY,
sample_name VARCHAR(45) NOT NULL UNIQUE

);

describe sample;



#Alter Table

describe student;

ALTER TABLE student ADD PRIMARY KEY(student_id);
ALTER TABLE student ADD age INT;
ALTER TABLE student DROP age;
ALTER TABLE student MODIFY COLUMN major VARCHAR(10);

ALTER TABLE student ADD age INT;
ALTER TABLE student ADD DOB DATE;
ALTER TABLE student ADD address VARCHAR(100);
ALTER TABLE student DROP COLUMN age, DROP COLUMN DOB, DROP COLUMN address;

ALTER TABLE student ADD DOB DATE;
ALTER TABLE student CHANGE DOB date_of_birth DATE;




#DROP command
show tables;

describe sample;

DROP TABLE sample;



#TRUNCATE

DROP TABLE sample;

CREATE TABLE sample(
sample_id INT AUTO_INCREMENT,
sample_name VARCHAR(50) NOT NULL,

CONSTRAINT sample_id_pk PRIMARY KEY(sample_id)

);

describe sample;

INSERT INTO sample(sample_name) VALUES("James");
INSERT INTO sample(sample_name) VALUES("Jacob");
INSERT INTO sample(sample_name) VALUES("Maya");
INSERT INTO sample(sample_name) VALUES("Sanjay");

SELECT * from sample;

DELETE FROM sample;

TRUNCATE sample;



#Constraints


describe student;

describe employee_data;



CREATE TABLE department(

department_id INT PRIMARY KEY,
department_name VARCHAR(10) NOT NULL

);


drop table employees;
drop table department;

CREATE TABLE employees(

employee_id INT PRIMARY KEY,
last_name VARCHAR(20) NOT NULL,
email VARCHAR(15) NOT NULL UNIQUE,
salary DOUBLE(6,2),
commission_percentage DOUBLE(2,2),
hire_date DATE NOT NULL,
dept_id INT,

#ADD FOREIGN KEY CONSTRAINT

CONSTRAINT emp_dept_fk FOREIGN KEY(dept_id) REFERENCES department(department_id) ON DELETE SET NULL


);

describe employees;


select * from employees;
select * from department;

delete from department where department_id=1;



INSERT INTO `ddl_batch_8`.`employees` (`employee_id`, `last_name`, `email`, `salary`, `commission_percentage`, `hire_date`, `dept_id`) VALUES ('1', 'James', 'xyz@gmail.com', '1200', '0.22', '1997-09-09', '1');
INSERT INTO `ddl_batch_8`.`employees` (`employee_id`, `last_name`, `email`, `salary`, `commission_percentage`, `hire_date`, `dept_id`) VALUES ('2', 'Jacob', 'abc@gmail.com', '1200', '0.22', '1997-09-09', '1');
INSERT INTO `ddl_batch_8`.`employees` (`employee_id`, `last_name`, `email`, `salary`, `commission_percentage`, `hire_date`, `dept_id`) VALUES ('3', 'Maya', 'qwe@gmail.com', '1200', '0.22', '1997-09-09', '1');
INSERT INTO `ddl_batch_8`.`employees` (`employee_id`, `last_name`, `email`, `salary`, `commission_percentage`, `hire_date`, `dept_id`) VALUES ('4', 'Sanjay', 'tyu@gmail.com', '1200', '0.22', '1997-09-09', '2');






#Listing All Constraints

SELECT column_name, constraint_name, referenced_column_name, referenced_table_name
FROM information_schema.KEY_COLUMN_USAGE
where TABLE_NAME="employees";



#DEFAULT Constraint

CREATE TABLE sample(

sample_id INT PRIMARY KEY,
sample_name VARCHAR(20) DEFAULT 'name'

);

INSERT INTO sample(sample_id) VALUES(1);
INSERT INTO sample(sample_id) VALUES(2);
INSERT INTO sample VALUES(3, "James");

select * from sample;






# ADDING A CONSTRAINT


drop table employees;


CREATE TABLE employees(

employee_id INT PRIMARY KEY,
last_name VARCHAR(20) NOT NULL,
email VARCHAR(15) NOT NULL,
salary DOUBLE(6,2),
commission_percentage DOUBLE(2,2),
hire_date DATE NOT NULL,
dept_id INT,

CONSTRAINT emp_email_uk UNIQUE(email)

);

describe employees;

select * from employees;
select * from department;

TRUNCATE department;
TRUNCATE employees;

ALTER TABLE employees ADD CONSTRAINT emp_dept_fk FOREIGN KEY(dept_id) REFERENCES department(department_id);



ALTER TABLE employees DROP INDEX emp_dept_fk;

ALTER TABLE employees DROP PRIMARY KEY;






























