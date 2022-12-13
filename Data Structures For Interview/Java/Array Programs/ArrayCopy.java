class ArrayCopy{

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] copy(int arr[]){

        int array[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }

        return array;

    }
    
    public static void main(String s[]){

        int arr[]={10,20,30,40,50,60,70,80,90,100};

        int[] copyArray=copy(arr);

        printArray(copyArray);
    }
}