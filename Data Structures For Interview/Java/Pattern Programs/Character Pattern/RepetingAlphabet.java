public class RepetingAlphabet {
    static int alphabet=65;
    public static void main(String s[]){

        int row=10;

        

        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){
                System.out.print((char)(alphabet)+" ");
            }
            alphabet++;

            System.out.println();
        }
    }
}
