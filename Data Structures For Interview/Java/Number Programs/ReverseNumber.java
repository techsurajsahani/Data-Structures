class ReverseNumber{

    static void reverse(int n){

        int sum=0;
        int temp=n;

        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }

        System.out.println("Reverse of "+temp+" is :- "+sum);
    }

    public static void main(String s[]){
        reverse(456789);
    }
}