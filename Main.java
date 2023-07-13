package LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertFirst(19);
        list.insertLast(45);
        list.display();
        list.insert(100,2);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}
