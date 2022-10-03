#For-loop

words = ["Linux","Windows","Mac"]

for w in words:
    print(w, len(w))

for w in range(len(words)): #length words list -> 3, when we say range(3) -> 0,1,2, because we have not defined the start like range(1,5), so it will by-default start from 0
    print(words[w], len(words[w]))

#if want to lookup in a range eg: (1,5) -> iterate through 1,2,3,4 only

a=9

for i in range(1,5):
    table = a*i
    print("{}*{} = {}".format(a,i,table))


#While Loop
count=0

while count<5:
    print(count)
    count=count+1

#break statement

for letter in 'Python':
    if(letter=='t'):
        break #it will move the cursor out of the loop
    print(letter)


#continue statement


for letter in 'Python':
    if(letter=='t'):
        continue # it will move the cursor back to the loop, so any code line below the continue statement will not get executed
    print(letter)


#Pass statement -> Used to write empty loops/control structure

for letter in 'Python':
    pass # it will do nothing
print("The letter is {}".format(letter))