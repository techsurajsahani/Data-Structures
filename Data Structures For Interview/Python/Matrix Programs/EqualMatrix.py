def checkEquality(list1,list2):

    flag=0

    for i in range(len(list1)):
        for j in range(len(list2[0])):
            if list1[i][j]!=list2[i][j]:
                flag=1
    
    if flag==0:
        print("Equal Matrix")
    else:
        print("Not Equal Matrix")

list1=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

list2=[
    [1,2,3],
    [4,11,6],
    [7,8,9]
]

checkEquality(list1,list2)
