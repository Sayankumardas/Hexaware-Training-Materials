class Target:
    def __init__(self,name, isHit):
        self.name = name
        self.isHit = isHit
    
    def hitsBullsEye(self):
        if(self.isHit==True):
            print("{} Hit BullsEye".format(self.name))


class BullsEye:
    def __init__(self,isHit):
        self.isHit = isHit

    def hitsBullsEye(self):
        if(self.isHit==True):
            print("Hits BullsEye")

target = Target("Kishore",True)
target.hitsBullsEye()

bullsEye = BullsEye(True)
bullsEye.hitsBullsEye()
    