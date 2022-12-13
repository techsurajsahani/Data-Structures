import java.util.Hashtable;

class HashTableImplementation{

    public static void main(String args[]){

        java.util.Hashtable<Integer,Integer> t=new Hashtable<Integer,Integer>();

        t.put(1,11);
        t.put(2,22);
        t.put(3,33);
        t.put(4,44);
        t.put(5,55);
        t.put(6,66);
        t.put(7,77);
        t.put(8,88);
        t.put(9,99);
        t.put(10,111);

        System.out.println("Elements of Hashtable are :- "+t);

        t.remove(9);

        System.out.println("Elements of Hashtable are :- "+t);
    }
}