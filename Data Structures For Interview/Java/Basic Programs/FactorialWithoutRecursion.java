class FactorialWithoutRecursion{

    static void printFactorial(int n){

        int factorial=1;

        for( int i=1;i<=n;i++){
            factorial=factorial*i;
        }

        System.out.println("Factorial of "+n+" is :- "+factorial);
    }

    public static void main(String s[]){

        printFactorial(4);
        printFactorial(5);
        printFactorial(6);
        printFactorial(7);
    }
}