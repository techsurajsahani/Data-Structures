class StackImplementation{

   public static void main(String args[]){

    java.util.Stack<Integer> s=new java.util.Stack<Integer>();

    System.out.println("Stack is empty :- "+s.isEmpty());

    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);

    System.out.println("Stack is empty :- "+s.isEmpty());

    System.out.println("Elements of Stack :-");
    for(int i : s){
        System.out.print(i+"  ");
    }
    System.out.println();

    System.out.println("Top of Stack :- "+s.peek());
    s.pop();
    System.out.println("Top of Stack :- "+s.peek());

    System.out.println("Elements of Stack :-");
    for(int i : s){
        System.out.print(i+"  ");
    }
   }
} 