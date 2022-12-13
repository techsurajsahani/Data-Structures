class LargestNumber{


    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nLargest Number :- "+arr[arr.length-1]);
        System.out.println("\nSecond Largest Number :- "+arr[arr.length-2]);
        System.out.println("\nThird Largest Number :- "+arr[arr.length-3]);
        System.out.println("\nSmallest Number :- "+arr[0]);
        System.out.println("\nSecond Smallest Number :- "+arr[1]);
        System.out.println("\nThird Smallest Number :- "+arr[2]);
    }

    public static void main(String s[]){

        int arr[]={1,5,9,2,5,0,3,2,66,99,77,88};

        java.util.Arrays.sort(arr);
        
        printArray(arr);
    }
}