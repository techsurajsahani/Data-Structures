def printFactorial(n):

    if n==0:
        return 1
    else:
        return n*printFactorial(n-1)

n=4

factorial=printFactorial(n)
print("Factorial of ",n," is :- ",factorial)