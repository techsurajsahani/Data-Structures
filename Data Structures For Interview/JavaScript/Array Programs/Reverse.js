function reverseArray(arr){
    for(let i=arr.length-1;i>=0;i--){
        console.log(arr[i]);
    }
}

let arr=[1,2,3,4,5,6,7,8,9,10];
reverseArray(arr);

let arr1=[1,2,3,4,5,6,7,8,9,10];
arr1=arr1.reverse();

for(let i=0;i<arr1.length;i++){
    console.log(arr1[i]);
}