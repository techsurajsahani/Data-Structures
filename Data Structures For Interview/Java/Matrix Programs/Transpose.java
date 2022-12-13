public class Transpose {

    static void transpose(int m[][]) {

        int row = m.length;
        int col = m[0].length;

        int transpose[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = m[j][i];
            }
        }

        System.out.println("Original Matrix :- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix :- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int m[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        transpose(m);
    }
}
