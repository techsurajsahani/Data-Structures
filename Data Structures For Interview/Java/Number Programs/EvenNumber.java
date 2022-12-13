class EvenNumber{

    static void printEven(int n){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String s[]){
        printEven(50);
    }
}