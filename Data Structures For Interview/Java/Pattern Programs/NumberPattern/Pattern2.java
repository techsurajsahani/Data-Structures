public class Pattern2 {
    static int count=1;
    public static void main(String s[]) {

        int row=10;
        
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
            
        }
        
    }
}
