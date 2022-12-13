def mul(list1,list2):

    # result is 3x4
    list3 = [[0,0,0,0],
            [0,0,0,0],
            [0,0,0,0]]


    for i in range(len(list1)):
        for j in range(len(list2[0])):
            for k in range(len(list2)):
                list3[i][j]+=list1[i][k]*list2[k][j]
    
    for l in list3:
        print(l)

list1=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

list2=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

# 3x3 matrix
X = [[12,7,3],
    [4 ,5,6],
    [7 ,8,9]]
# 3x4 matrix
Y = [[5,8,1,2],
    [6,7,3,0],
    [4,5,9,1]]

mul(list1,list2)
mul(X,Y)