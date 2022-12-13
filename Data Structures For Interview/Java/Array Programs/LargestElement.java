class LargestElement{

    static void largestElement(int arr[]){

        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max+" is largest element");
    }

    public static void main(String s[]){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        largestElement(arr);
    }
}