import math

def checkArmstrong(n):

    temp=n
    sum=0
    digits=0

    while temp>0:
        temp=int(temp/10)
        digits=digits+1

    temp=n

    while temp>0:
        rem=temp%10
        sum=sum+math.pow(rem,digits)
        temp=int(temp/10)

    if n==sum:
        print(n," is Armstrong number")
    else:
        print(n," is not Armstrong number")

checkArmstrong(407)
    


