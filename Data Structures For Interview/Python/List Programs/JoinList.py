firstList=[1,2,3,4,5]
secondList=[6,7,8,9,10]

mylist=firstList+secondList
print(mylist)

firstList.extend(secondList)
print(firstList)

for  x in secondList:
    firstList.append(x)

print(firstList)

print(firstList.count(6))