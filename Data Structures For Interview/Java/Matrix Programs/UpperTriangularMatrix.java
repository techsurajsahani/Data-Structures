class UpperTriangularMatrix{

    static void printUpperTriangularMatrix(int m[][]){

        int row=m.length;
        int col=m[0].length;

        if(row!=col){
            System.out.println("Matrix should be square matrix");
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i>j){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print(m[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String s[]){
        int m[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printUpperTriangularMatrix(m);
    }
}