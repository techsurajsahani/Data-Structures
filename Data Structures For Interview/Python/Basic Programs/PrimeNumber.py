def checkPrimeNumber(n):

    flag=0
    half=int(n/2)

    if(n==0 or n==1):
        print(n," is not prime number")
    else:
        for i in range(half):
            if i==0:
                pass
            else:

                if n%i==0:
                    print(n," is not prime number")
                    flag=1
                    break
        
        if flag==0:
            print(n," is prime number")

checkPrimeNumber(1)
checkPrimeNumber(3)
checkPrimeNumber(17)
checkPrimeNumber(20)