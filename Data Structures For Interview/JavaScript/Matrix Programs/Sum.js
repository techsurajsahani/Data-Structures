function sum(m1){

    let row=[];
    let col=[];

    let rowSum=0;
    let colSum=0;

    for(let i=0;i<m1.length;i++){
        rowSum=0;
        for(let j=0;j<m1[0].length;j++){
            rowSum+=m1[i][j];
        }
        row[i]=rowSum;
    }
    
    for(let i=0;i<m1.length;i++){
        colSum=0;
        for(let j=0;j<m1[0].length;j++){
            colSum+=m1[j][i];
        }
        col[i]=colSum;
    }

    for(let i=0;i<row.length;i++){
        console.log("Sum of "+(i+1)+" th row is :- "+row[i]);
    }
    for(let i=0;i<col.length;i++){
        console.log("Sum of "+(i+1)+" th column is :- "+col[i]);
    }
}

let m1=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

let m2=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

sum(m1);