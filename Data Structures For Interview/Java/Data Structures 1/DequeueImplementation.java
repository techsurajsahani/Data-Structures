public class DequeueImplementation {
    public static void main(String args[]){

        java.util.Deque<Integer> s=new java.util.ArrayDeque<Integer>();
    
        System.out.println("Deque is empty :- "+s.isEmpty());
    
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
    
        System.out.println("Deque is empty :- "+s.isEmpty());
    
        System.out.println("Elements of Deque :-");
        for(int i : s){
            System.out.print(i+"  ");
        }
        System.out.println();

        s.addFirst(60);

        System.out.println("Elements of Deque :-");
        for(int i : s){
            System.out.print(i+"  ");
        }
        System.out.println();

        s.addLast(70);

        System.out.println("Elements of Deque :-");
        for(int i : s){
            System.out.print(i+"  ");
        }
        System.out.println();

        s.removeFirst();

        System.out.println("Elements of Deque :-");
        for(int i : s){
            System.out.print(i+"  ");
        }
        System.out.println();

        s.removeLast();

        System.out.println("Elements of Deque :-");
        for(int i : s){
            System.out.print(i+"  ");
        }
        System.out.println();
        
        System.out.println("Top of Deque :- "+s.peek());
        s.remove();
        System.out.println("Top of Deque :- "+s.peek());

        System.out.println("First Element of Deque :- "+s.getFirst());
        System.out.println("Last Element of Deque :- "+s.getLast());
    
        System.out.println("Elements of Deque :-");
        for(int i : s){
            System.out.print(i+"  ");
        }
        }
    
}
