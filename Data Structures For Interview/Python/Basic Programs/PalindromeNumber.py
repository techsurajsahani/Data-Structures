def checkPalindromeNumber(n):

    temp=n
    sum=0

    while n>0:
        rem=n%10
        sum=sum*10+rem
        n=int(n/10)

    if temp==sum:
        print(temp," is palindrome number")
    else:
        print(temp," is not palindrome number")

checkPalindromeNumber(454)
checkPalindromeNumber(545)
checkPalindromeNumber(678)
checkPalindromeNumber(876)