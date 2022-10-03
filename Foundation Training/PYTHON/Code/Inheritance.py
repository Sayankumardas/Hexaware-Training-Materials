#parent-class

class Hexa_Project:

    def Project1(self):
        print("BFS")
    def Project2(self):
        print("ATM")

#child-class

class Hexa_Admin(Hexa_Project):

    #method overriding
    def Project1(self):
        print("Method Overriden")
    
    def Project3(self):
        print("Hexavarsity")
    def Project4(self):
        print("HR")


hex = Hexa_Project()
hex1 = Hexa_Admin()

hex.Project1()
hex1.Project1()
hex1.Project2()