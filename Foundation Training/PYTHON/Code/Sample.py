class Person:
    _a=10 #it will not make this varaible private, its just a naming convention to tell the programmers that it is used in a private scope
    b=10
    pass

def func():
    return

person = Person()
print(person.b)
print(person._a)


func()


a=2
print(a.__add__(5))



num=10
print(type(num))
num="abc"
print(type(num))




