function checkPrimeNumber(n){

    let flag=0;
    let half=n/2;

    if(n==0||n==1){
        console.log(n+" is not prime number");
    }
    else{
        for(let i=2;i<half;i++){
            if(n%i==0){
                console.log(n+" is not prime number");
                flag=1;
                break;
            }
        }

        if(flag==0){
            console.log(n+" is prime number");
        }
    }

}

checkPrimeNumber(1);
checkPrimeNumber(3);
checkPrimeNumber(17);
checkPrimeNumber(20);
