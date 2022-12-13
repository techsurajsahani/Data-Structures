public class FactorialWithRecursion {

    static int printFactorial(int n){

        if(n==0){
            return 1;
        }
        else{
            return (n*printFactorial(n-1));
        }
    }
    
    public static void main(String[] args) {
       
        int n=4;
        int factorial=printFactorial(4);
        System.out.println("Factorial of "+n+" is :- "+factorial);
    }
}
