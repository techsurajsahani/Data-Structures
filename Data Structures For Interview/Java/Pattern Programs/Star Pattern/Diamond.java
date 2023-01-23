

public class Diamond {

    public static void main(String s[]){
        for(int i=1;i<=10;i++){
            for(int j=10-i;j>=1;j--){

                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                if(i!=1){
                    System.out.print("*");
                }

                
            }
            System.out.println((""));
            
        }
        for(int i=10;i>=0;i--){
            for(int j=10;j>i;j--){

                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            if(i==0){
                System.out.print("*");
            }
            System.out.println((""));
                
            }
            
            
        }
    }
    

