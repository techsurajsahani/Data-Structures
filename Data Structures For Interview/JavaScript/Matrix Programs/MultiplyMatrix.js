function mul(m1,m2){

    let m3=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ];

    for(let i=0;i<m1.length;i++){
        for(let j=0;j<m2[0].length;j++){
            for(let k=0;k<m2.length;k++){
                m3[i][j]+=m1[i][k]*m2[k][j];
            }
        }
    }
    
    console.log(m3);

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

mul(m1,m2)