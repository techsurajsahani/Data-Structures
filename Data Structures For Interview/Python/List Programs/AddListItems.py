mylist=[1,2,3,4,5,6,7,8,9,10]
mylist.append(100)
print(mylist)

mylist.insert(2,222)
print(mylist)

firstList=[1,2,3,4,5,6,7,8,9,10]
secondList=[11,22,33,44,55,66,77,88,99,110]

firstList.append(secondList)
print(firstList)
firstList.extend(secondList)
print(firstList)

mylist=[1,2,3,4,5]
mytuple=(1,2,3,4,5)
myset={1,2,3,4,5}
mydict={
    1:"Suraj Sahani",
    2:"Divya",
    3:"Sayali",
    4:"Kirtilekha"
}
mylist.extend(mytuple)
mylist.extend(myset)
mylist.extend(mydict)
print(mylist)