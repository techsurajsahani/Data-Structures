class OddPosition{

    static void printArray(int arr[]){

        for(int i=1;i<arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String s[]){
        int arr[]={0,1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
    }
}