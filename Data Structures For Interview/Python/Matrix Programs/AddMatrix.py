def add(lsit1,list2):

    list3=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ]

    for i in range(len(list1)):
        for j in range(len(list1[0])):
            list3[i][j]=list1[i][j]+list2[i][j]
    
    print(list3)

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

add(list1,list2)