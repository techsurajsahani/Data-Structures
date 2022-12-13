mylist=[1,2,3,4,5,6,7,8,9,10]

# for x in mylist:
#     print(x)

# for x in range(len(mylist)):
#     print(mylist[x])

i=0

while i<len(mylist):
    print(mylist[i])
    i=i+1

[print(x) for x in mylist]