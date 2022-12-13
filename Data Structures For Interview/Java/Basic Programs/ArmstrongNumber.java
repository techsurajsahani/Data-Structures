class ArmstrongNumber{

    static boolean checkArmstrong(int n){

        int temp=n;
        int digits=0;
        int sum=0;

        while(temp>0){
            temp=temp/10;
            digits++;
        }

        temp=n;

        while(temp>0){
            int rem=temp%10;
            sum=(int) (sum+(java.lang.Math.pow(rem,digits)));
            temp=temp/10;
        }

        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Enter a number upto which you want Armstrong number :- ");
        
        java.util.Scanner sc =new java.util.Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            if(checkArmstrong(i)){
                System.out.println(i+" is Armstrong number");
            }
        }

        sc.close();
    }
}