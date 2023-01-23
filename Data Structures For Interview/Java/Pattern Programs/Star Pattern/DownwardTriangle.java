

public class DownwardTriangle {

    public static void main(String s[]){
        for(int i=1;i<=20;i++){
            for(int j=1;j<20-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=1;i<=20;i++){
            for(int j=20;j>20-i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<20-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
