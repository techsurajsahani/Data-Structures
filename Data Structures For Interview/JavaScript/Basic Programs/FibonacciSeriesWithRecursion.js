let n1=0;
let n2=1;
let n3=1;

function printFibonacciSeries(count){
    if(count>0){
        n3=n1+n2;
        console.log(" "+n3);
        n1=n2;
        n2=n3;
        printFibonacciSeries(count-1);
    }
}

let count=20;

console.log(n1+" "+n2);
printFibonacciSeries(count-2);