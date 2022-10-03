#public
class employee:
    def __init__(self,name,sal):
        self.name = name
        self.sal=sal

#private
class student:
    def __init__(self,name,sal):
        self.__name = name
        self.__sal = sal
    
    def config(self):
        print(self.__name, self.__sal)

emp = employee("James",1200)
print(emp.sal)

stu = student("Jacob",1210)
stu.config()