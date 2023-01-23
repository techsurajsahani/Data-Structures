public class RightTriangleAlphabetic {
    
    public static void main(String s[]){

        int row=9;

        int alphabet=65;

        for(int i=1;i<=row;i++){

            for(int j=0;j<i;j++){
                System.out.print((char)(alphabet+j)+" ");
            }

            System.out.println();
        }
    }
}
