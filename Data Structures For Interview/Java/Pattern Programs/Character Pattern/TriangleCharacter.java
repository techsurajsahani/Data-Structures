public class TriangleCharacter {
    
    static int alphabet=65;

    public static void main(String s[]){

        int row=9;

        

        for(int i=1;i<=row;i++){

            for(int j=i;j<row;j++){
                System.out.print(" ");
            }

            for(int j=0;j<i;j++){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();
        
 
        }

    
    }
}
