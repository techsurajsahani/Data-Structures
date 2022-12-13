function removeDuplicateElements(arr){

    let array=[];
    let index=1;

    for(let i=0;i<arr.length;i++){

        let element=arr[i];
        let flag=0;
        

        for(let k=0;k<array.length;k++){
            if(array[k]==element){
                flag=1;
                break;
            }
        }

        if(flag==0){
            array[index]=element;
            index++;
        }

    }

    return array;
}

let arr=[1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10];
arr=removeDuplicateElements(arr)

for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
}