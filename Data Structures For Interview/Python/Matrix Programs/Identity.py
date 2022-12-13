def identity(list1):

    flag=0

    for i in range(len(list1)):
        for j in range(len(list1)):
            if i==j:
                if list1[i][j]==1:
                    pass
                else:
                    flag=1
                    break
            else:
                if list1[i][j]==0:
                    pass
                else:
                    flag=1
                    break
    if flag==0:
        print("The given matrix is an Identity Matrix")
    else:
       print("The given matrix is not an Identity Matrix") 

list1=[
    [1,0,0],
    [0,1,0],
    [0,0,1]
]
list2=[
    [1,0,0],
    [1,1,0],
    [0,0,1]
]

identity(list1)
identity(list2)