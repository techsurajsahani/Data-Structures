public class VowelsCounter {

    static void vowelsCounter(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) 
                         == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U') {
                System.out.println(s.charAt(i));
                count++;
            }
        }

        System.out.println("The number of vowels exists in the string are :- " + count);
    }

    public static void main(String[] args) {
        String str = "I am Suraj Sahani.I am Full Stack Web Developer.";
        vowelsCounter(str);

    }
}
