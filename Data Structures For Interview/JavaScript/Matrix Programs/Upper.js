function upper(m1){

    let m3=[
        [0,0,0],
        [0,0,0],
        [0,0,0]
    ]

    for(let i=0;i<m1.length;i++){
        for(let j=0;j<m1[0].length;j++){
            if(i>j){
                m3[i][j]=0;
            }
            else{
                m3[i][j]=m1[i][j];
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
    [7,8,99]
];

upper(m1)