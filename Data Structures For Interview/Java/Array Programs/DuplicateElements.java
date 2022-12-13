class DuplicateElemnts{

    static void duplicateElements(int arr[]){

        int array[]=new int[arr.length];
        
        for(int i=0;i<array.length;i++){
            array[i]=0;
        }

        for(int i=0;i<arr.length;i++){

            int element=arr[i];
            int count=0;
            int flag=0;

            for(int k=0;k<array.length;k++){
                if(array[k]==element){
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==element){
                        count++;
                        break;
                    }
                }
    
                if(count>0){
                    System.out.println(element+" is duplicate element");
                }
            }

            
            count=0;
            array[i]=element;
        }
    }

    public static void main(String s[]){

        int arr[]={10,20,30,40,50,60,70,80,90,100,10,50,60};

        duplicateElements(arr);
    }
}