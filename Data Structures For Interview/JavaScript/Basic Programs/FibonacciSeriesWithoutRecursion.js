function printFibonacciSeries(count){

    let n1=0;
    let n2=1;
    let n3;

    console.log(n1+" "+n2);

    for(let i=0;i<count;i++){
        n3=n1+n2;
        console.log(" "+n3);
        n1=n2;
        n2=n3;
    }
}

printFibonacciSeries(20);