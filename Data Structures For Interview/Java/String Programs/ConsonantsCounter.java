public class ConsonantsCounter {
    static void consonantsCounter(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'B' || s.charAt(i) == 'C' || s.charAt(i) == 'D' || s.charAt(i) == 'F'
                || s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'J' || 
                s.charAt(i)=='K'|| s.charAt(i) == 'L'|| s.charAt(i) == 'M' ||s.charAt(i) == 'N' || 
                s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R'|| s.charAt(i) == 'S' 
                || s.charAt(i) == 'T' || s.charAt(i)=='V'||s.charAt(i)== 'W'|| s.charAt(i) == 'X'|| 
                s.charAt(i) == 'Y'||s.charAt(i)=='Z' ) {

                System.out.print(s.charAt(i)+"  ");
                count++;
            }
            if (s.charAt(i) == 'b' || s.charAt(i) == 'c' || s.charAt(i) == 'd' || s.charAt(i) == 'f'
                || s.charAt(i) == 'g' || s.charAt(i) == 'h' || s.charAt(i)=='j'|| s.charAt(i) == 
                 'k'|| s.charAt(i) == 'l' ||s.charAt(i) == 'm' || s.charAt(i) == 'n' || s.charAt(i) 
                  == 'p' || s.charAt(i) == 'q' || s.charAt(i) == 'r'|| s.charAt(i) == 's' 
                || s.charAt(i) == 't' || s.charAt(i)=='v'||s.charAt(i)== 'w'|| s.charAt(i) == 'x'|| 
                s.charAt(i) == 'y'||s.charAt(i)=='z' ) {

                System.out.print(s.charAt(i)+"  ");
                count++;
            }

        }

        System.out.println("The number of consonants exists in the string are :- " + count);
    }

    public static void main(String[] args) {
        String str = "I am Suraj Sahani.I am Full Stack Web Developer.";
        System.out.println("Total Length :- "+str.length());
        consonantsCounter(str);

    }
}
