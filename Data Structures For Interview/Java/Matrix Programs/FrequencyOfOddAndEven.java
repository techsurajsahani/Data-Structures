public class FrequencyOfOddAndEven {

    static void printFrequencyOfOddAndEven(int m[][]){

        int row=m.length;
        int col=m[0].length;

        int even=0;
        int odd=0;

        if(row!=col){
            System.out.println("Matrix should be square matrix");
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(m[i][j]%2==0){
                        even++;
                    }
                    else{
                    odd++;
                }
            }
        }
        System.out.println("Frequency Of Even Numbers :- "+even);
        System.out.println("Frequency Of Odd Numbers :- "+odd);
    }
}

    public static void main(String[] args) {
        int m[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printFrequencyOfOddAndEven(m);
    }
}
