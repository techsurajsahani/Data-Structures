public class DiamondCharacter {

    static int alphabet = 65;

    public static void main(String s[]) {

        int row = 16;

        for (int i = 1; i <= row; i++) {

            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= (2 * i - 1); k++) {

                if (k == 0 || k == (2 * i - 1)) {
                    System.out.print((char) (alphabet));
                    if(i==1){
                        break;
                    }

                } else {
                    System.out.print(" ");
                }

            }
            alphabet++;
            System.out.println();
        }


        alphabet=80;
        for (int i = row; i>=1; i--) {

           
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= (2 * i - 1); k++) {

                

                if (k == 0 || k == (2 * i - 1)) {
                    System.out.print((char) (alphabet));
                    if(i==1){
                        break;
                    }

                } else {
                    System.out.print(" ");
                }

            }
            alphabet--;
            System.out.println();
        }

    }
}
