n1=0
n2=1
n3=1

def printFibonacciSeries(count):
    global n1,n2,n3
    if count>0:
        n3=n1+n2
        print(" ",n3)
        n1=n2
        n2=n3
        printFibonacciSeries(count-1)

count=20
print(n1," ",n2)
printFibonacciSeries(count-2)