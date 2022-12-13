class DivideNEqualParts{

    static void divide(String s,int parts){

        int length=s.length();
        int possibleCharacters=length/parts;
        int index=0;

        char array[]=new char[possibleCharacters];
        int arrayIndex=0;
        String result[]=new String[parts];

        if((length%parts)==0){

            for(int i=0;i<length;i++){
                array[arrayIndex]=s.charAt(i);
                arrayIndex++;
                if((i+1)%possibleCharacters==0){
                    String temp=new String(array);
                    // System.out.println("Temp :- "+temp);
                    result[index]=new String(temp);
                    arrayIndex=0;
                    index++;
                }
            }

            for(int i=0;i<result.length;i++){
                System.out.println(result[i]);
            }
        }
        else{
            System.out.println("Not possible to divide into N equal parts.");
        }
    }

    public static void main(String args[]){

        String str="aaaabbbbccccddddeeeeffff";
        divide(str, 3);
    }
}