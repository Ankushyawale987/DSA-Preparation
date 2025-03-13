/*
Linked List in Java
A Linked List is a linear data structure consisting of nodes where each node contains a value and a reference (or link) 
to the next node in the sequence. In Java, the LinkedList class is part of the java.util package and implements the List and Deque interfaces.

Key Characteristics of Linked List:
Dynamic Size: Unlike arrays, a LinkedList does not have a fixed size. It grows and shrinks dynamically as elements are added or removed.
Efficient Insertions and Deletions: Adding or removing elements from the beginning or middle of the list is efficient (O(1) if the position is known), unlike arrays where shifting is required.
Memory Overhead: Each node in a linked list contains additional memory for storing the reference (pointer) to the next node.
No Random Access: Linked Lists don't allow direct access to elements like arrays. To access an element, you need to traverse the list from the head node.

*/


import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        // 3. Adding element at the first position (using addFirst)
        list.addFirst("Grapes");

        // 4. Adding element at the last position (using addLast)
        list.addLast("Orange");

        // 5. Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 6. Removing elements
        list.removeFirst(); // Removes first element
        list.removeLast();  // Removes last element

        // 7. Removing a specific element
        list.remove("Banana"); // Removes the element "Banana"

        // 8. Checking if a specific element exists
        System.out.println("Contains 'Cherry': " + list.contains("Cherry"));

        // 9. Traversing using a for-each loop
        System.out.println("LinkedList elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 10. Clearing all elements
        list.clear();
        System.out.println("LinkedList after clear: " + list);
    }
}
/*
Method	            Description
add(E e)	          Adds an element at the end of the list.
addFirst(E e)	      Adds an element at the beginning of the list.
addLast(E e)	      Adds an element at the end of the list (same as add).
getFirst()	        Returns the first element of the list.
getLast()	          Returns the last element of the list.
removeFirst()	      Removes the first element of the list.
removeLast()	      Removes the last element of the list.
remove(Object o)	  Removes the first occurrence of the specified element.
contains(Object o)	Checks if the specified element is present in the list.
size()	Returns the number of elements in the list.
clear()	Removes all elements from the list.
*/
