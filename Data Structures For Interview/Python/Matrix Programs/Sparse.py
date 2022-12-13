def sparse(list1):

    zero=0
    row=len(list1)
    print("Row :- ",row)
    col=len(list1[0])
    print("Col :- ",col)
    size=row*col
    print("Size :- ",size)
    print("Size :- ",size/2)

    for i in range(len(list1)):
        for j in range(len(list1[0])):
            if list1[i][j]==0:
               zero=zero+1
    if zero > (size/2):
        print("The given matrix is an sparse Matrix")
    else:
       print("The given matrix is not an sparse Matrix") 

list1=[
    [1,0,0],
    [0,1,0],
    [0,0,1]
]
list2=[
    [1,0,0],
    [1,1,1],
    [1,1,1]
]

sparse(list1)
sparse(list2)