#taking input from user -> by default user-input is treated as a string
x = input()
print(type(x), x)

a = int(input("Enter First Number"))
b = int(input("Enter Second Number"))
print("{}+{} = {}".format(a,b,a+b))