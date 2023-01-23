public class KShaped {
    
    static int alphabet=65;
    public static void main(String s[]){

        int row=10;

        

        for(int i=1;i<=row;i++){

            for(int j=0;j<row-i;j++){
                System.out.print((char)(alphabet+j)+" ");
            }
        

            System.out.println();
        }

        for(int i=1;i<row;i++){

            for(int j=0;j<i;j++){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();
        }
    }
}
