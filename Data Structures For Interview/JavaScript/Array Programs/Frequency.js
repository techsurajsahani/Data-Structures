function frequency(arr){

    let array=[]

    for(let i=0;i<arr.length;i++){
        
        let element=arr[i];
        let count=1;
        let flag=0;

        for(let k=0;k<array.length;k++){
            if(array[k]==element){
                flag=1;
                break;
            }
        }

        if(flag==0){
            for(let j=i+1;j<arr.length;j++){
                if(arr[j]==element){
                    count++;
                }
            }
    
            console.log("Frequency of "+element+" is :- "+count);
        }

       array[i]=element;
        
    }
}

let arr=[1,2,3,4,5,6,7,8,9,10,3,3,4,4,5,5,6,6];
frequency(arr);