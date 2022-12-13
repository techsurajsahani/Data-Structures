class Sparse {

    static void checkSparse(int m[][]) {

        int row = m.length;
        int col = m[0].length;

        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (m[i][j] == 0) {
                    count++;
                }
            }
        }
        int sparse = (row * col) / 2;

        if (count > sparse) {
            System.out.println("The given matrix is Sparse Matrix");
        } else {
            System.out.println("The given matrix is not Sparse Matrix");
        }
    }

    public static void main(String s[]) {

        int m[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int m2[][] = {
                { 4, 0, 0 },
                { 0, 5, 0 },
                { 0, 0, 6 }
        };

        checkSparse(m);
        checkSparse(m2);
    }
}