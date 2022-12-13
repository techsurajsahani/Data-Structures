class SmallestElement{

    static void smallestElement(int arr[]){

        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println(min+" is smallest element");
    }

    public static void main(String s[]){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        smallestElement(arr);
    }
}