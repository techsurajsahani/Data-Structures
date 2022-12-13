class AscendingSort{


    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String s[]){

        int arr[]={1,5,9,2,5,0,3,2,66,99,77,88};

        java.util.Arrays.sort(arr);
        
        printArray(arr);
    }
}