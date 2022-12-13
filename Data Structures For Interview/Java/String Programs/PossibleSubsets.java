class PossibleSubsets{

    static void possibleSubsets(String s){
        
        int size=s.length()*(s.length()+1)/2;
        System.out.println("Possible Subsets :- "+size);
        int temp=0;

        String result[]=new String[size];

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                result[temp]=s.substring(i,j+1);
                temp++;
            }
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"  ");
        }
    }
    public static void main(String[] args) {
        String s="FUN";
        possibleSubsets(s);
    }
}

