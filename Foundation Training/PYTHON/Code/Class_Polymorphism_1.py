# in mthod-overloading based on different-set of arguments the last method is taken into consideration

class sample:

    def config(self,arg1,arg2):
        print(arg1, arg2)

    def config(self,arg1):
        print("First ",arg1)
    
    def config(self, arg1):
        print("Second ", arg1)

smp = sample()
smp.config(12)
smp.config("Hello")