function checkPalindromeNumber(n){

    let temp=n;
    let sum=0;

    while(n>0){
        let rem=n%10;
        sum=sum*10+rem;
        n=parseInt(n/10);
    }

    if(temp==sum){
        console.log(temp+" is palindrome number");
    }
    else{
        console.log(temp+" is not palindrome number");
    }
}

checkPalindromeNumber(454);
checkPalindromeNumber(545);
checkPalindromeNumber(678);
checkPalindromeNumber(876);