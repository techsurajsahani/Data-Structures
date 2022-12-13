class TotalNumberOfCharacters{

    static void numberOfCharacters(String s){

        char array[]=s.toCharArray();
        System.out.println("Total number of characters :- "+array.length);
    }
    public static void main(String[] args) {
        String s="Suraj Sahani";
        numberOfCharacters(s);
    }
}