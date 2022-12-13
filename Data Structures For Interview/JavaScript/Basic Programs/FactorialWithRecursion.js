function printFactorial(n){

    if(n==0){
        return 1;
    }
    else{
        return n*printFactorial(n-1);
    }
}

let n=4;
let factorial=printFactorial(n);
console.log("Factorial of "+n+" is :- "+factorial);