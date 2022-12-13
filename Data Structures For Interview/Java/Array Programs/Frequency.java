class Frequency{

    static void calculateFrequency(int arr[]){

        int array[]=new int[arr.length];
        
        for(int i=0;i<array.length;i++){
            array[i]=0;
        }

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            int count=1;
            int flag=0;

            for(int k=0;k<array.length;k++){
                if(array[k]==element){
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                for(int j=i+1;j<arr.length;j++){
                    if(element==arr[j]){
                        count++;
                    }
                }
                System.out.println("Frequency of "+element+" is :- "+count);
                
            }
            count=0;
            array[i]=element;



           
        }
    }
    public static void main(String s[]){

        int arr[]={10,10,10,10,10,10,20,20,20,20,20,30,30,30,30,30,40,40,40,40,50,50,50,60,60};

        calculateFrequency(arr);

    }
}