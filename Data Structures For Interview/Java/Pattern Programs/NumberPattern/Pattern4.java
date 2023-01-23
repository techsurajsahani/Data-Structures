public class Pattern4 {
    static int count=1;
    public static void main(String s[]) {

        int row=20;
        
        for(int i=1;i<=row;i++){

            int j=row;
            int k=i;
            while(k>0){

                System.out.print(j+" ");
                k--;
                j--;
            }
            System.out.println("");
            
        }
        
    }
}
