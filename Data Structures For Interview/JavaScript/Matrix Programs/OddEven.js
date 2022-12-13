function oddeven(m1){

    let even=0;
    let odd=0;

    for(let i=0;i<m1.length;i++){
        for(let j=0;j<m1[0].length;j++){
            if(m1[i][j]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
    }
    
    console.log("Frequency of even numbers are :- "+even);
    console.log("Frequency of odd numbers are :- "+odd);

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

oddeven(m1);