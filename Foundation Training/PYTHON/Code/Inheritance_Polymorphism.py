class Customer:
    def __init__(self,name):
        self.name = name
    
    def details(self):
        print("Customer Information.....")


class Order(Customer):

    def __init__(self,ordername):
        super().__init__("James")
        self.ordername=ordername
    
    def details(self):
        print("Order Details !!!!")
        print(self.name, self.ordername)


class empty:
    pass


order = Order("Watch")
order.details()