public class Pattern6 {
    static int count=1;
    public static void main(String s[]) {

        int row=10;
        
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){

                if(j%2==0){
                    System.out.print("0 ");
                }
                else{
                   System.out.print("1 "); 
                }
                
            }
            System.out.println("");
        }
        
    }
}
