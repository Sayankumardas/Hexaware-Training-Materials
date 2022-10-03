class computer:

    #defining constructor
    def __init__(self,ram,hardisk):
        self.ram = ram
        self.hardisk = hardisk

    def config(self):
        print("Configurations")
        print(self.ram, self.hardisk)

#create objects
comp1 = computer("8GB","512GB")
comp2 = computer("16GB","1TB")
comp3 = computer("1GB","500MB")

print(comp1.config()) #this will print none becaus the method config() is not returning anything
print(comp2.config())

comp1.config() # this will not print none
comp2.config()