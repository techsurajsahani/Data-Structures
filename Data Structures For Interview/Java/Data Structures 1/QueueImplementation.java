class PriorityQueueImplementation{

    public static void main(String args[]){

    java.util.Queue<Integer> s=new java.util.PriorityQueue<Integer>();

    System.out.println("PriorityQueue is empty :- "+s.isEmpty());

    s.add(10);
    s.add(20);
    s.add(30);
    s.add(40);
    s.add(50);

    System.out.println("PriorityQueue is empty :- "+s.isEmpty());

    System.out.println("Elements of PriorityQueue :-");
    for(int i : s){
        System.out.print(i+"  ");
    }
    System.out.println();

    System.out.println("Top of PriorityQueue :- "+s.peek());
    s.remove();
    System.out.println("Top of PriorityQueue :- "+s.peek());

    System.out.println("Elements of PriorityQueue :-");
    for(int i : s){
        System.out.print(i+"  ");
    }
    }
}