def transpose(list1):

    result=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ]

    for i in range(len(list1)):
        for j in range(len(list1)):
            result[i][j]=list1[j][i]

    for i in result:
        print(i)

list1=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

transpose(list1)