def frequency(list1):

    list2=list(range(len(list1)))
    index=0

    for i in range(0,len(list2)):
        list2[i]=0

    for i in range(0,len(list1)):

        element=list1[i]
        count=1
        flag=0

        for k in range(0,len(list2)):
            if list2[k]==element:
                flag=1
                break
        
        if flag==0:

            for j in range(i+1,len(list1)):
                if list1[j]==element:
                    count=count+1
            
            print("Frequency of ",element," is :- ",count)
            list2[index]=element
            index=index+1

list1=[1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6]

frequency(list1)
