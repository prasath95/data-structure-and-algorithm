package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(11);
        list.insert(43);
        list.insert(55);
        list.insert(46);
        list.insert(63);
        list.insert(23);

        list.insertAt(2,100);

        list.deleteAt(0);

        list.show();
    }
}
