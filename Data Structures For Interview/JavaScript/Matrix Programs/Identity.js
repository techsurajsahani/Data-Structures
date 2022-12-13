function identity(m){

    let row=m.length;
    let col=m[0].length;

    let flag=0;

        for(let i=0;i<row;i++){
            for(let j=0;j<col;j++){
               if(i==j){
                if(m[i][j]!=1){
                    flag=1;
                }
               }
               else{
                if(m[i][j]!=0){
                    flag=1;
                }
               }
            }
        }

        if(flag==0){
            console.log("The given matrix is an Identity matrix.");
        }
        else{
            console.log("The given matrix is not an Identity matrix.");
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

identity(m2);