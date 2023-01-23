public class Pattern7 {
    public static void main(String s[]) {

        int row=10;

        for(int i=1;i<=row;i++){

            for(int j=i;j<=(2*i-1);j++){
                System.out.print(" ");
            }

            for(int k=i;k<=row;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }
        
        for(int i=row;i>=1;i--){

            if(i==row){

                continue;
            }

            for(int j=i;j<=(2*i-1);j++){
                System.out.print(" ");
            }

            for(int k=i;k<=row;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }
        
    }
}
