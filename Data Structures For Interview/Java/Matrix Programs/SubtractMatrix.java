class SubtractMatrix {

    static void sub(int m1[][],int m2[][]){
        int m3[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m3[i][j]=m1[i][j]-m2[i][j];
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }


    }

    public static void main(String s[]){

        int m1[][]={
            {10,10,10},
            {10,10,10},
            {10,10,10}
        };

        int m2[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        sub(m1,m2);

    }
}