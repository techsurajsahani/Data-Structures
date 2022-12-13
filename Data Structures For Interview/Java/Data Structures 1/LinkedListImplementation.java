class LinkedListImplementation{

public static void main(String args[]){

        java.util.LinkedList<Integer> l=new java.util.LinkedList<Integer>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

        l.addFirst(0);

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

        l.addLast(11);

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

        l.removeFirst();

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

        l.removeLast();

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

        l.remove();

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

        System.out.println("First Element of LinkedList :- "+l.getFirst());
        System.out.println("Last Element of LinkedList :- "+l.getLast());

        java.util.Collections.sort(l);

        System.out.println("Elements of LinkedList :- ");
        for(int i :l){
            System.out.print(i+" ");
        }
        System.out.println("");

    }
}