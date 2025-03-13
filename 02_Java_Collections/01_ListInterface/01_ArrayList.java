/*
Definition of ArrayList in Java
ArrayList is a resizable array implementation of the List interface in Java, provided by the java.util package. 
It allows dynamic growth and provides fast random access, unlike arrays that have a fixed size.

Key Characteristics of ArrayList:
Dynamic Size: Unlike arrays, ArrayList can grow and shrink dynamically as elements are added or removed.
Indexed Access: Elements can be accessed in constant time O(1) using an index.
Fast Iteration & Searching: Searching elements in an ArrayList takes O(n) time in the worst case.
Duplicate Elements Allowed: Unlike Set, ArrayList allows duplicate elements.
Ordered Collection: It maintains the order in which elements are inserted.
Not Thread-Safe: ArrayList is not synchronized, meaning multiple threads modifying it simultaneously can cause issues. 
Use Collections.synchronizedList(new ArrayList<>()) for thread safety.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        // 3. Inserting at a specific index
        list.add(2, "Grapes");

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating an element
        list.set(1, "Blueberry");

        // 6. Removing an element
        list.remove("Mango"); // Removes by value
        list.remove(0); // Removes by index

        // 7. Checking if an element exists
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // 8. Getting the size of the ArrayList
        System.out.println("Size of list: " + list.size());

        // 9. Iterating using a for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 10. Iterating using an Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 12. Reversing the ArrayList
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // 13. Checking if the list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 14. Clearing all elements
        list.clear();
        System.out.println("List after clear(): " + list);
        System.out.println("Is list empty after clear()? " + list.isEmpty());
    }
}
/*
Key ArrayList Functions Used:
add(element) – Adds an element to the list.
add(index, element) – Inserts an element at a specific index.
get(index) – Retrieves an element at a given index.
set(index, element) – Updates an element at a given index.
remove(index) – Removes an element by index.
remove(Object) – Removes an element by value.
contains(element) – Checks if an element exists.
size() – Returns the number of elements in the list.
isEmpty() – Checks if the list is empty.
clear() – Removes all elements.
sort() – Sorts the list.
reverse() – Reverses the order of elements.
iterator() – Iterates through elements.

*/
