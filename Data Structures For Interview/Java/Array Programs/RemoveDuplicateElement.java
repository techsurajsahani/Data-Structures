class RemoveDuplicateElements{

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }


    static int[] removeDuplicateElements(int arr[]){

        int array[]=new int[arr.length];
        int index=0;
        int flag=0;

        for(int i=0;i<arr.length;i++){

            int element=arr[i];

            for(int j=0;j<arr.length;j++){
                if(array[j]==element){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                array[index]=element;
                index++;
            }
            flag=0;
        }

        return array;
    }

    public static void main(String s[]){

        int arr[]={10,20,30,40,50,50,40,60,70,80,90,70,90};

        arr=removeDuplicateElements(arr);

        printArray(arr);
    }
}