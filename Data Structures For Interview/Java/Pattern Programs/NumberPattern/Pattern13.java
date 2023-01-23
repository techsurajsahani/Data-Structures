public class Pattern13 {
    public static void main(String[] args) {
        
        int row=9;

        for(int i=1;i<=row;i++){

            for(int k=i;k<=(2*i-1);k++){
                System.out.print(" ");
            }

            for(int j=i;j<=row;j++){
                System.out.print(j);

            }
            System.out.println();
        }

        for(int i=row;i>=1;i--){

            if(i==row){
                continue;
            }

            for(int k=i;k<=(2*i-1);k++){
                System.out.print(" ");
            }

            for(int j=i;j<=row;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
