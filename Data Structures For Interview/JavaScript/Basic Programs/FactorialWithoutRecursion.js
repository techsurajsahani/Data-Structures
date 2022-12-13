function printFactorial(n){

    let factorial=1;

    for(let i=1;i<=n;i++){
        factorial=factorial*i;
    }

    console.log("Factorial of "+n+" is :- "+factorial);
}

printFactorial(4);
printFactorial(5);
printFactorial(6);
printFactorial(7);