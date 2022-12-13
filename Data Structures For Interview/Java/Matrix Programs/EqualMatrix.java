class EqualMatrix{

    static void checkEquality(int m1[][],int m2[][]){

        int row1=m1.length;
        int row2=m2.length;

        int col1=m1[0].length;
        int col2=m2[0].length;

        if(row1!=row2 || col1!=col2){
            System.out.println("Both matrices are not equal.");
        }
        else{
            int flag=0;

            for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 if(m1[i][j]!=m2[i][j]){
                     flag=1;
                     break;
                 }
             }
            }
     
            if(flag==0){
             System.out.println("Both matrices are equal.");
            }
            else{
             System.out.println("Both matrices are not equal.");
            }
        }

       
    }
    
    public static void main(String s[]){

        int m1[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int m2[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        checkEquality(m1,m2);
    }
}