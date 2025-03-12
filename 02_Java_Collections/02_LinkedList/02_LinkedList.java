/*
A Linked List in Java is a data structure used to store a collection of elements 
in a non-contiguous manner. Each element (node) in a linked list consists of two parts:

Data – Stores the actual data.
Next – Stores the reference to the next node in the list.
Java provides a built-in LinkedList class in the java.util package, 
which implements the List interface. 
It supports various operations such as insertion, 
deletion, and traversal efficiently.
*/
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        System.out.println("LinkedList: " + list);

        // Removing elements
        list.removeFirst();
        list.removeLast();
        list.remove(new Integer(20));
        System.out.println("After Deletion: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Searching
        System.out.println("Contains 30? " + list.contains(30));

        // Traversing using a for-each loop
        System.out.print("Traversing using for-each: ");
        for (int num : list) {
            System.out.print(num + " -> ");
        }
        System.out.println("NULL");

        // Traversing using an Iterator
        System.out.print("Traversing using Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " -> ");
        }
        System.out.println("NULL");

        // Traversing using for loop
        System.out.print("Traversing using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
    }
}
