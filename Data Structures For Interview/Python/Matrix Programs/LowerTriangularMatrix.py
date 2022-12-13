def lower(list1):

    result=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ]

    for i in range(len(list1)):
        for j in range(len(list1)):
            if j>i:
                result[i][j]=0
            else:
                result[i][j]=list1[i][j]

    for i in result:
        print(i)

list1=[
    [1,2,3],
    [1,2,3],
    [1,2,3]
]

lower(list1)