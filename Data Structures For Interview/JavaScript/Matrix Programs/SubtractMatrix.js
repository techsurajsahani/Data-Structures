function sub(m1,m2){

    let m3=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ];

    for(let i=0;i<m1.length;i++){
        for(let j=0;j<m1[0].length;j++){
            m3[i][j]=m1[i][j]-m2[i][j];
        }
    }
    
    console.log(m3);

}

let m1=[
    [10,10,10],
    [10,10,10],
    [10,10,10]
];

let m2=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

sub(m1,m2)