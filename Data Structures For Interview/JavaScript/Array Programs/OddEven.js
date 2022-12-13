function printEvenPosition(arr){
    for(let i=0;i<arr.length;i++){
        if(i%2==0){
            console.log(arr[i]);
        }
    }
}
function printOddPosition(arr){
    for(let i=0;i<arr.length;i++){
        if(i%2!=0){
            console.log(arr[i]);
        }
    }
}
function printEvenNumber(arr){
    for(let i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            console.log(arr[i]);
        }
    }
}
function printOddNumber(arr){
    for(let i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            console.log(arr[i]);
        }
    }
}

let arr=[0,1,2,3,4,5,6,7,8,9,10];
printOddNumber(arr);

