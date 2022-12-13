mylist=[1,2,3,4,5,6,7,8,9,10]
mylist[2]=22
print(mylist)

mylist[2:6]=[22,33,44,55]
print(mylist)

mylist[2:3]=[66,22,88,99]
print(mylist)

mylist[3:7]=[77]
print(mylist)

mylist.insert(6,444)
print(mylist)