def sum(list1):

    row=[0,0,0]
    col=[0,0,0]

    rowSum=0
    colSum=0

    for i in range(len(list1)):
        rowSum=0
        for j in range(len(list1)):
           rowSum=rowSum+list1[i][j]
        row[i]=rowSum

    for i in range(len(list1)):
        colSum=0
        for j in range(len(list1)):
           colSum=colSum+list1[j][i]
        col[i]=colSum

    print("Following are sum of each row ",row)
    print("Following are sum of each col ",col)
    
list1=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

sum(list1)