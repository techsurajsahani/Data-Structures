public class Pattern8 {
    public static void main(String s[]) {

        int row=10;

        for(int i=1;i<=row;i++){

            

            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }
        for(int i=row;i>=1;i--){

            

            if(i==row){
                continue;
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }
        
        
        
    }
}
