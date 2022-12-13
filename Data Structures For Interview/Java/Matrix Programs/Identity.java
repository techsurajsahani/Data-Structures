class Identity{

    static void checkIdentity(int m[][]){

        int row=m.length;
        int col=m[0].length;

        int flag=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    if(m[i][j]==1){

                    }
                    else{
                        flag=1;
                        break;
                    }
                }
                else{
                    if(m[i][j]==0){

                    }
                    else{
                        flag=1;
                        break;
                    }
                }
            }
        }

        if(flag==0){
            System.out.println("The given matrix is Identity Matrix");
        }
        else{
            System.out.println("The given matrix is not Identity Matrix");
        }
    }
    
    public static void main(String s[]){

        int m[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

        int m2[][] = {
            { 1, 0, 0 },
            { 0, 1, 0 },
            { 0, 0, 1 }
    };

    checkIdentity(m);
    checkIdentity(m2);
    }
}