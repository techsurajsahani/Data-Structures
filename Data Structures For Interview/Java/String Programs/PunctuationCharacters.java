class PunctuationsCharacters {

    static void punctuationsCounter(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.'
                    || s.charAt(i) == '?' || s.charAt(i) == '-' ||
                    s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':') {
                count++;
            }
        }

        System.out.println("The number of punctuations exists in the string are :- "+count);
    }

    public static void main(String args[]) {
        String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    
        punctuationsCounter(str);
    }
}