#Numeric
a=10
print(type(a))

b=10.2
print(type(b))
print(isinstance(b, float))

c=10+2j
print(type(c))

#Sequence

#1. List
list = ["James",2,3,4,10+2j,16.78,"Jacob"]
print(list)
print(list.__len__())
print(len(list))
print(type(list))

print(list[1])
print(list[6])
list[6]="Maya"
print(list)

list.append(["Dream","Sleep",["Yen","Rupees","USD"]])
print(list)


print(list[7][2][0])


name=["James","Jacob"]
id=[1001,1002]

company = [id,name]
print(company)

# 2. Tuple
tup=(1,2,3,4,"5")
print(type(tup))
print(tup)
#tup[0]=10 -> is not supported
print(tup)


#3. String

s1='abc  '
s2="def  "
s3='''ghi'''


print(s1+s2+s3) # + operator in strings -> appends
print(s1*2) # * operator will repeat the string


#Sets
s = {10,2,34,56,10} # order will not be followed, every element will be prited once
print(type(s))
print(s)
print(len(s)) # it will be the count of elements only once
print(s)
s.update([1,2,3])
print(s)
s.add("James")
print(s)

#Dictionary
d={1:"ABC", "XYZ":"Person", 2:"XYZ"}
print(type(d))
print(d)
print(d[1])
print(d["XYZ"])

d.update({"XYZ":"James"})
print(d)

d["color"]="red"
print(d)

d[2]="RRR"
print(d)
