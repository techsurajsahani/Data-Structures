def upper(list1):

    result=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ]

    for i in range(len(list1)):
        for j in range(len(list1)):
            if i>j:
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

upper(list1)