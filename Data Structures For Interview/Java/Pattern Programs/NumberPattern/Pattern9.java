public class Pattern9 {
    
    public static void main(String[] args)  {

        int row=10;

        for(int i=1;i<=row;i++){


            for(int k=row;k>=i;k--){
                System.out.print(k+" ");
            }

            System.out.println("");

        }
        
    }
}
