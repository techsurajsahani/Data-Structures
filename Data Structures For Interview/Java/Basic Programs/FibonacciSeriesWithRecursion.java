public class FibonacciSeriesWithRecursion {
    
    static int n1=0,n2=1,n3=0;

    static void printFibonacciSeries(int count){
        if(count>0){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            printFibonacciSeries(count-1);
        }
    }

    public static void main(String[] args) {
        int count=20;
        System.out.print(n1+" "+n2);
        printFibonacciSeries(count-2);
    }
}
