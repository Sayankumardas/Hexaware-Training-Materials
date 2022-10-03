create database JOINS;

use JOINS;

select * from customer;
describe customer;

select * from Shipper;
select * from Employee;
select * from order_table;
describe order_table;


alter table order_table add CONSTRAINT customer_id_fk FOREIGN KEY(CustomerID) references customer(CustomerID);
alter table order_table add CONSTRAINT shipper_id_fk FOREIGN KEY(ShipperID) references shipper(ShipperID);
alter table order_table add Constraint employee_id_fk FOREIGN KEY(EmployeeID) references employee(EmployeeID);



#Query to get customer details for each order

select  c.CustomerName, c.Country, c.City, o.OrderID, o.OrderDate
FROM Customer c, order_table o
WHERE c.CustomerID=o.CustomerID;


#We want to keep WHERE clause for querying conditions only: ON keyword
select c.CustomerName, c.Country, c.City, o.OrderID, o.OrderDate
FROM Customer c INNER JOIN order_table o
ON c.CustomerID=o.CustomerID;

#This is same as inner join

select c.CustomerName, c.Country, c.City, o.OrderID, o.OrderDate
FROM Customer c JOIN order_table o
ON c.CustomerID=o.CustomerID;


#Joining Multiple Tables-> I want my customer, emmployee and shipper details for respective Order

select * from order_table;

select o.OrderID,c.CustomerName, c.Country, e.EmployeeName, s.ShipperName, o.OrderDate
from Customer c INNER JOIN order_table o ON c.CustomerID=o.CustomerID
INNER JOIN employee e ON e.EmployeeID=o.EmployeeID
INNER JOIN shipper s ON s.ShipperID=o.ShipperID;


#Left Outer Join

select * from customer;
select * from order_table;



select c.CustomerName, o.OrderDate
FROM Customer c LEFT JOIN Order_table o 
ON c.CustomerId=o.CustomerID;


#This is same as LEFT JOIN
select c.CustomerName, o.OrderDate
FROM Customer c LEFT OUTER JOIN Order_table o 
ON c.CustomerId=o.CustomerID;




#Right Outer Join

select * from order_table;

select c.CustomerName, o.OrderDate
FROM Customer c RIGHT JOIN order_table o
ON c.CustomerID=o.CustomerID;

select * from Department;
select * from Employee;

select e.EmployeeName, d.DepartmentName
From employee e RIGHT JOIN department d
ON e.EmployeeId=d.EmployeeID;


#Similar to Right JOIN

select e.EmployeeName, d.DepartmentName
From employee e RIGHT OUTER JOIN department d
ON e.EmployeeId=d.EmployeeID;



#SELF JOIN

select * from employee;
describe employee;


alter table employee add CONSTRAINT manager_id_fk FOREIGN KEY(ManagerId) references employee(EmployeeID);

#Query to get Manager name for respective employees

select e.EmployeeName as Employee, m.EmployeeName as Manager
FROM employee m Inner Join employee e
ON m.employeeID=e.ManagerId;


#Sub-Queries:


#Find all the employees having maximum salary

select * from employee;

select EmployeeName, salary
From employee
Where salary = (

	select max(salary)
    from employee

);


#multiple columsn in select query example

select * from item;

#query -> display details of any item, which the productid and the quantity matches the product ID and quantity of orderID = 365 and I dont want to display ORDERID 365


select OrderID, ProductID, Quantity
from item
WHERE (ProductID, Quantity) IN (

	SELECT ProductID, Quantity
    From item
    Where OrderID=365

)

AND OrderID<>365;





#Single-Row subqueries -> return only a single value for us to compare
select * from employee;

#Query-> to retrieve my employees having salary greater than 'James'

select EmployeeID, EmployeeName, salary
from employee
where salary > (

	select salary
    from employee
    where EmployeeName LIKE 'James'

);


select * from job;

select * from employee;
describe employee;

alter table employee add CONSTRAINT emp_job_fk FOREIGN KEY(JobId) references job(JobId);


#Query-> we want employees with job_id same as emp->3 and salary greater than emp->4



select EmployeeName
From employee
where JobId=(        # JobId=2

	select JobId
    FROM employee
    where EmployeeId=3

) AND salary> (         #salary>1231

	select salary
    FROM employee
    Where EmployeeId=4

);




#Query ->  details of least earning employee

select * from employee;

select EmployeeId, EmployeeName
from employee
where salary = (

	select min(salary)
    from employee


);


#Multi-row subquery

select * from Customer;
select * from employee;
describe employee;

alter table employee add CONSTRAINT emp_cust_fk FOREIGN KEY(CustomerID) references Customer(CustomerId);



#Query-> to fetch customer details, for the employees having salary > 2000

select CustomerName, City, Country
from Customer
where CustomerId IN (

	select CustomerId
	from employee
	where salary>2000

);




#Group By

select * from department;
select * from employee;
describe Employee;

alter table employee add CONSTRAINT emp_dept_fk Foreign KEY(DepartmentId) references department(DepartmentId);

#Query-> get details of department having min(salary) > min(salary) department-2


select DepartmentName
from Department
where DepartmentId In (

	select DepartmentId
	from employee
	group by DepartmentId
	having min(salary) > (
    
		select min(salary)
		from employee
		where DepartmentId=2
	)

);




#Eg:


#Query -> List employees earning least salary in each department

select * from employee;

#Before Changing
select EmployeeName, DepartmentId, salary
from employee
where salary IN (

	select min(salary) 
	from employee
	group by DepartmentId

);


#After Changing
select EmployeeName, DepartmentId, salary
from employee
where (DepartmentId,salary) IN (

	select DepartmentId, min(salary) 
	from employee
	group by DepartmentId

);





