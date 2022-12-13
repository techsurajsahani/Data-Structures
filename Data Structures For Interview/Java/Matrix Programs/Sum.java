public class Sum {

    static void sum(int m[][]){

        int row=m.length;
        int col=m[0].length;

        int rowSum[]=new int[row];
        int colSum[]=new int[col];

        int rowItem=0;
        int colItem=0;

        for(int i=0;i<row;i++){
            rowItem=0;
            for(int j=0;j<col;j++){
                rowItem+=m[i][j];
            }
            rowSum[i]=rowItem;
        }

        for(int i=0;i<row;i++){
            colItem=0;
            for(int j=0;j<col;j++){
                colItem+=m[j][i];
            }
            colSum[i]=colItem;
        }

        for(int i=0;i<rowSum.length;i++){
            System.out.println("Sum of "+(i+1)+" th row  is :- "+rowSum[i]);
        }
        for(int i=0;i<colSum.length;i++){
            System.out.println("Sum of "+(i+1)+" th column is :- "+colSum[i]);
        }
    }
    public static void main(String[] args) {

        int m[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        sum(m);
    }
}
