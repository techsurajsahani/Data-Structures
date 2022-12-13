let arr=[1,2,3,4,5,6,7,8,9,3,4,5,6,7,8,9,1,2];
arr.sort();
for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
}
console.log("Largest Element :- "+arr[arr.length-1]);
console.log("Smallest Element :- "+arr[0]);

let sum=0;
for(let i=0;i<arr.length;i++){
    sum=sum+arr[i];
}
console.log("sum is :- "+sum);