list1=[1,2,3,4,5,6,7,8,9,10,21,22,23,24,25,26,27,28,29,30,11,12,13,14,15,16,17,18,19,20,11,12,13,14,15,16,17,18,19,20,11,12,13,14,15,16,17,18,19,20]
# list1=[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

print("Elements of list are :- ",list1)

# list1.reverse()
# print("Elements of list in reverse order are :- ",list1)

def evenPosition(list1):
    print("Even Position Elements are :- ")
    for i in range(0,len(list1)):
        if i%2==0:
            print(list1[i])

def oddPosition(list1):
    print("Odd Position Elements are :- ")
    for i in range(0,len(list1)):
        if i%2!=0:
            print(list1[i])

def evenElements(list1):
    print("Even Elements are :- ")
    for i in range(0,len(list1)):
        if list1[i]%2==0:
            print(list1[i])

def oddElements(list1):
    print("Odd Elements are :- ")
    for i in range(0,len(list1)):
        if list1[i]%2!=0:
            print(list1[i])

# evenPosition(list1)
# oddPosition(list1)
# evenElements(list1)
# oddElements(list1)

print(max(list1))
print(min(list1))
print(sum(list1))

list1.sort()
print("Ascending order :- ",list1)
list1.reverse()
print("Descending Order :- ",list1)

list1.sort()
print("Largest Element :- ",list1[len(list1)-1])
print("Second Largest Element :- ",list1[len(list1)-2])
print("Third Largest Element :- ",list1[len(list1)-3])
print("Smallest Element :- ",list1[0])
print("Second Smallest Element :- ",list1[1])
print("Third Smallest Element :- ",list1[2])

list1=set(list1)
print(list1)