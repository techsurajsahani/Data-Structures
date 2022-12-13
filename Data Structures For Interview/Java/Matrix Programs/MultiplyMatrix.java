class MultiplyMatrix {

    static void mul(int m1[][],int m2[][]){
        int m3[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m3[i][j]=0;
               for(int k=0;k<3;k++){
                m3[i][j]+=m1[i][k]*m2[k][j];
               }
               System.out.print(m3[i][j]+"  ");
            }
            System.out.println();
        }

    }

    public static void main(String s[]){

        int m1[][]={
            {1,1,1},
            {2,2,2},
            {3,3,3}
        };

        int m2[][]={
            {1,1,1},
            {2,2,2},
            {3,3,3}
        };

        mul(m1,m2);

    }
}