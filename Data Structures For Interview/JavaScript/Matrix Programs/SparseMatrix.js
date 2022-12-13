function sparse(m){

    let row=m.length;
    let col=m[0].length;

    let size=row*col;
    let zero=0;

        for(let i=0;i<row;i++){
            for(let j=0;j<col;j++){
               if(m[i][j]==0){
                zero++;
               }
            }
        }

        if(zero>(size/2)){
            console.log("The given matrix is  Sparse matrix.");
        }
        else{
            console.log("The given matrix is not  Sparse matrix.");
        }
    
}

let m=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

let m2=[
    [1,0,0],
    [0,1,0],
    [0,0,1]
];

sparse(m);