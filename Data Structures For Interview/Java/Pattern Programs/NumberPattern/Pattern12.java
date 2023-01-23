public class Pattern12 {
    
   public static void main(String[] args) {
    

    int row=10;

    for(int i=row;i>=1;i--){

        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();

   }

    for(int i=1;i<=row;i++){

        if(i==1){
            continue;
        }

        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();

   }
}
}