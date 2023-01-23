public class Pattern16 {
    public static void main(String s[]){

        int row=9;
        for(int i=1;i<=row;i++){

            for(int j=i;j<=row;j++){
                System.out.print(j+" ");
            }

            if(i!=1){
                for(int k=1;k<=i-1;k++){
                    System.out.print(k+" ");
                }
            }

           



            System.out.println();
        }
    }
}
