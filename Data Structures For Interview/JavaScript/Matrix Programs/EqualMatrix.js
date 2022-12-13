function equal(m1,m2){

    let flag=0;

    for(let i=0;i<m1.length;i++){
        for(let j=0;j<m1[0].length;j++){
            if(m1[i][j]!=m2[i][j]){
                flag=1;
                break;
            }
        }
    }

    if(flag==0){
        console.log("Both matrices are equal");
    }
    else{
        console.log("Both matrices are not equal");
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
    [7,8,99]
];

equal(m1,m2)