public class Pattern14 {
    public static void main(String[] args) {
        
        int row=8;

       for(int i=1;i<=row;i++){

        for(int j=1;j<=row-i;j++){
            System.out.print("1");
        }

        for(int j=1;j<=i;j++){
            System.out.print(i);
        }

        System.out.println();
       }
    }
}
