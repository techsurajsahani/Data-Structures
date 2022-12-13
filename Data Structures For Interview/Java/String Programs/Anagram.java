class Anagram{

    static void anagram(String str1,String str2){

        if(str1.length() != str2.length()){
            System.out.println("The number of characters in both the strings must be same.");
        }
        else{
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            char array1[]=str1.toCharArray();
            char array2[]=str2.toCharArray();

            java.util.Arrays.sort(array1);
            java.util.Arrays.sort(array2);

            int flag=0;

            for(int i=0;i<array1.length;i++){
                if(array1[i]!=array2[i]){
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                System.out.println("Strings are Anagram");
            }
            else{
                System.out.println("Strings are not Anagram");
            }
        }
    }

    public static void main(String args[]){
        
        String str1="Suraj Sahani";
        String str2="Sahani Suray";

        anagram(str1, str2);
    }
}