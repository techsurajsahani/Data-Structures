class RightTriangle{
    public static void main(String[] args) {

        for(int i=1;i<=6;i++){
            for(int j=10-i;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    }