string = "Python Programming"

#Slicing
print(string[2:5]) # it will print characters at indices 2,3,4 -> >=2 & <5 -> [2,5)
print(string[:]) # it will pring complete string
print(string[2:]) # it will print everything from index 2
print(string[-2:]) # it will print the last two characters
print(string[-4:-2]) # print every index from the 4th last index to the 2nd last but 2nd will not be included

#Concatenation
s1="abc"
s2="xyz"
print(s1+s2)
print(s1*2)

#length of string
print(string, len(string))


#Strip Function
string="    Hi I Have      Ending Spaces        "
print(string)
print(string.strip()) # it will remove spaces from the start of the string, from the end of the string but not from the middle of the string
print(string) #old-string will get printed
string = string.strip()
print(string) #new-string will get printed

#upper
print(string.upper())

#lower
print(string.lower())

#replace
print("Before Replace -> {}".format(string))
print("During Replace -> {}".format(string.replace('Have','Had')))
print("After Replace -> {}".format(string)) # since we have not assigned the outpur of string.replace so the old string will get printed

#split
list = string.split(' ')
print(list, len(list))

#find
print(string.find('a')) #index of first occurence
print(string.find('z')) #print -1 -> not found
print(string.find(' '))

#max and min -> based on ASCII values
string="aAzZ" #ASCII -> A-Z, a-z

print(max(string))
print(min(string))