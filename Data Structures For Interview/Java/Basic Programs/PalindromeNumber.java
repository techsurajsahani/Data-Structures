class PalindromeNumber{

    static void checkPalindromeNumber(int n){

        int temp=n;
        int sum=0;

        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }

        if(temp==sum){
            System.out.println(temp+" is palindrome number");
        }
        else{
            System.out.println(temp+" is not palindrome number"); 
        }
    }

    public static void main(String s[]){

        checkPalindromeNumber(454);
        checkPalindromeNumber(545);
        checkPalindromeNumber(678);
        checkPalindromeNumber(876);
    }
}