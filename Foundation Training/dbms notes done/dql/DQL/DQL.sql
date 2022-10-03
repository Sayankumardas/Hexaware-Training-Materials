SET SQL_SAFE_UPDATES=0;

use DDL_BATCH_8;


select * from department;

SELECT department_id AS "DEPT NO" from department;

SELECT department_id "DEPT NO" from department;

SELECT department_id DEPT_NO from department;

SELECT department_id AS DEPT_NO from department;

#Arithematic Operators
select * from employees;

select last_name, salary*12 AS "YEARLY salary" from employees;

select last_name, salary from employees where (salary+salary*commission)> 2000;


select * from student;


select name from student where major LIKE "CSE" AND grade LIKE "A";

select name from student where major LIKE "ECE" OR grade LIKE "A";

alter table student add column age INT NOT NULL;

select * from student where age<>24;

select * from student where age BETWEEN 23 AND 24;

select * from student where age NOT BETWEEN 23 AND 24;


select * from student;

select * from student where student_id IN (1,2,5);

select * from student where student_id NOT IN (1,2,5);


select * from student where name LIKE "Jacobs";


select * from student where name LIKE "Jacob%";

select * from student where name LIKE "J%acob";

select * from student where name LIKE "%ay%";

select * from student where name like "__n%";

select * from student where name like "%e_";

select * from student order by name;

select * from student order by name DESC;

select * from student where name LIKE "J%" order by age;

select * from student where name LIKE "J%" order by age DESC;


select * from employees;

update employees set dept_id =2 where employee_id in(4,5);
update employees set salary = 290 where employee_id=5;


select * from employees order by dept_id DESC, salary;
select * from employees order by salary, dept_id DESC;


select sum(salary) from employees;
select avg(salary) from employees;


select * from employees;
insert into employees values(6,"abc","xyz@gmail.com",2345,0.19, "2022-03-09",null, 0.2);
delete from employees where dept_id IS NULL;

select count(*) from employees;
select count(dept_id), count(salary) from employees;

select distinct(dept_id) from employees where dept_id IS NOT NULL;
select count(distinct(dept_id)) from employees where dept_id IS NOT NULL;


select distinct(dept_id) from employees;
select count(distinct(dept_id)) from employees;






select * from employees;

#write a query to get average salary of each department-> print average salary of department 1 and department 2

select dept_id, avg(salary) from employees group by dept_id having dept_id IS NOT NULL;

#it will throw error
select last_name, dept_id, avg(salary) from employees group by dept_id having dept_id IS NOT NULL;

#it will throw error
select last_name, dept_id, avg(salary) from employees group by dept_id having dept_id IS NOT NULL AND last_name IS NOT NULL;


update employees set last_name="James" where employee_id=1;
update employees set last_name="Jacob" where employee_id=2;
update employees set last_name="Maya" where employee_id=3;
update employees set last_name="Sanjay" where employee_id=4;
update employees set last_name="Kapil" where employee_id=5;

update employees set last_name="xyz";


#it will not throw error
select last_name, dept_id, avg(salary) from employees group by dept_id, last_name having dept_id IS NOT NULL AND last_name IS NOT NULL;


select last_name, dept_id, avg(salary) from employees group by dept_id AS "DEPT", last_name AS "LAST" having dept_id IS NOT NULL AND last_name IS NOT NULL;



select dept_id, SUM(salary) from employees GROUP BY dept_id HAVING sum(salary)>3700 AND dept_id IS NOT NULL;




# we want the sum salary of each department having persons whose second character is 'a', and we 
#will display only those departments whose sum>2000 and diplay it in ascending order and department_id should not be null

select * from employees;

SELECT dept_id, sum(salary)
FROM employees
WHERE last_name LIKE '_a%'
GROUP BY dept_id
HAVING sum(salary)>2000 AND dept_id IS NOT NULL
ORDER BY dept_id;















