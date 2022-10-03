# *args
def fun_args(*args):
    print(args)

# **kwargs

def fun_kwargs(**kwargs):
    print(kwargs)


#function calls
fun_args(10,20,30,40,50,10)
fun_args(1,2,3)

fun_kwargs(ename="James",eid=1001)
fun_kwargs(ename="Jacob",eid=1003, age=25)