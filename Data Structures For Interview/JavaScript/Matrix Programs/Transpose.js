function transpose(m){

    let row=m.length;
    let col=m[0].length;

    if(row!=col){
        console.log("The given matrix is not square matrix");
    }
    else{

        let matrix=[
            [0,0,0],
            [0,0,0],
            [0,0,0]
        ];

        for(let i=0;i<row;i++){
            for(let j=0;j<col;j++){
                matrix[i][j]=m[j][i];
            }
        }

        console.log(matrix);
    }
}

let m=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

transpose(m);