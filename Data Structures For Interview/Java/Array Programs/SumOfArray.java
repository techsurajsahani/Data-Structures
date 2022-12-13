class SumOfArray{

    static void sum(int arr[]){

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        System.out.println(sum);
    }

    public static void main(String s[]){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        sum(arr);
    }
}