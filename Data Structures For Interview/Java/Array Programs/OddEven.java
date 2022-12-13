class OddEven{

    static void evenElements(int arr[]){
        System.out.print("Even Elements :- ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    static void oddElements(int arr[]){
        System.out.print("Odd Elements :- ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String s[]){

        int arr[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        evenElements(arr);
        oddElements(arr);
    }
}