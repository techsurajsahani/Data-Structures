class DescendingSort{


    static void printArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String s[]){

        int arr[]={1,5,9,2,5,0,3,2,66,99,77,88};

        java.util.Arrays.sort(arr);
        
        printArray(arr);
    }
}