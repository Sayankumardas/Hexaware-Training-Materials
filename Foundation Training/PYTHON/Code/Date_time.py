import calendar
import time
import datetime

#time
print(time.time()) #print time passed since 1/1/1970 12:00am
print(time.localtime())
print(time.localtime(time.time()))

#to print time in redable format
unReadable = time.localtime(time.time())
readable = time.asctime(unReadable)
print(readable)

#To print the calendar for given month and year

cal = calendar.month(2022,8)
print(cal)

#use datetime module
x = datetime.datetime.now()
print(x)
print(x.year)
print(x.strftime("%A")) # current Day name
print(x.strftime("%Y")) #current year
print(x.strftime("%m")) #current month -> m should be small
print(x.strftime("%d"))
print(x.strftime("%H:%M:%S"))
print(x.strftime("%m/%Y/%d:%H:%M:%S"))

x1 = datetime.datetime(2020, 11 ,23)
print(type(x1), x1)


s = "hello"+str(1+2+3)
print(s)