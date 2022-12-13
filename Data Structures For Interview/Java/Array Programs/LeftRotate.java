class LeftRotate{

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotateArray(int arr[]){

        int array[]=new int[arr.length];
        array[array.length-1]=arr[0];

        for(int i=1;i<arr.length;i++){
            array[i-1]=arr[i];
        }
        return array;
    }
    public static void main(String s[]){

        int arr[]={1,2,3,4,5,6,7,8,9,10};

        arr=rotateArray(arr);
        arr=rotateArray(arr);
        arr=rotateArray(arr);
        arr=rotateArray(arr);

        printArray(arr);
    }
}