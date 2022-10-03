#only-if

num=45

if num>25: # adding brackets() around the condition is optional
    print("Yes! {} is greater than 25".format(num))

#if-else

r=10

if r%2==0:
    print("Even")
    print("Good Number")
else:
    print("Odd")


#nesting-if

if r%2==0:
    print("good")
    if True:
        print("great")
else:
    print("Odd")


#if-elif-else

a=20
b=25
c=80

if a>b:
    print("a: ",a)
    print("a: {}".format(a))
elif a>c:
    print("a with {} ;".format(c),a)
elif b>c:
    print("b with {} ".format(c),b)
else:
    print("{}".format(c))