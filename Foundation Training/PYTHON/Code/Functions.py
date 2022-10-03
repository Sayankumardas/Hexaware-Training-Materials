import Calculation

def greet(name):
    """action the function will perform"""
    print("Hello, "+name+" .Welcome to Python Programming")

def welcome():
    greet("James")

def employeeDetails(eid, ename):
    print("Employee Id: ", eid)
    print("Employee Name: "+ename)
    return

#calling through prompt
greet("Jacob")

#calling through another function
welcome()

#function calling through keywords
employeeDetails(1001,"James")
employeeDetails(ename="Jacob",eid=1002)

#function calling using modules
print(Calculation.subtract(b=12,a=23)) #through keyword
print(Calculation.subtract(20,12))

