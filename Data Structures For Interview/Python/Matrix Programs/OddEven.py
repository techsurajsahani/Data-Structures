def oddeven(list1):

    even=0
    odd=0

    for i in range(len(list1)):
        for j in range(len(list1)):
            if list1[i][j]%2==0:
                even=even+1
            else:
                odd=odd+1
    
    print("Frequency of even numbers :- ",even)
    print("Frequency of odd numbers :- ",odd)

list1=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

oddeven(list1)