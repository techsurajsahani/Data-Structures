function checkArmstrong(n){

    try{

        let temp=n;
        let sum=0;
        let digits=0;

        while(temp>0){
            temp=parseInt(temp/10);
            digits++;
        }
    
        temp=n;
    
        while(temp>0){
            let rem=temp%10;
            sum=sum+Math.pow(rem,digits);
            temp=parseInt(temp/10);
        }
 
        if(n==sum){
            console.log(n+" is Armstrong number");
        }
        else{
            console.log(n+" is not Armstrong number");
        }
    }
    catch(e){
        console.log(e.message());
    }

    

}

checkArmstrong(372);
