class computer:
    def config(self):
        print("Hi this is a new computer")

#Instantiate a class
comp = computer()

#two-ways

computer.config(comp) # it is not used commonly

comp.config() # this will be interpreted as -> <<class-name>>.config(<<object-name>>) ->computer.config(comp)