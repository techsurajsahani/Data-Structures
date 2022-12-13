class PrimeNumber{

    static void checkPrimeNumber(int n){

        int flag=0;
        int half=n/2;

        if(n==0|| n==1){
            System.out.println(n+" is not prime number");
        }
        else{
            for(int i=2;i<half;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                System.out.println(n+" is prime number");
            }
        }
    }
    public static void main(String s[]){
        PrimeNumber.checkPrimeNumber(1);
        PrimeNumber.checkPrimeNumber(3);
        PrimeNumber.checkPrimeNumber(17);
        PrimeNumber.checkPrimeNumber(20);
    }
}