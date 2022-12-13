class LargestNumber{

    static void findLargest(int n1,int n2, int n3){
        
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is largest number.");
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+" is largest number.");
        }
        else if(n3>n1 && n3>n2){
            System.out.println(n3+" is largest number.");
        }
        else{
            System.out.println("All are equals.");
        }
    }

    public static void main(String s[]){
        findLargest(10,20,30);
        findLargest(10,40,30);
        findLargest(10,20,50);
        findLargest(30,30,30);
    }
}