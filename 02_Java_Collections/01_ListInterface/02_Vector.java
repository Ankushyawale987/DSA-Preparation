/*
Vector in Java
Vector is a dynamic array implementation in Java that is similar to ArrayList, but with built-in synchronization for thread safety.

Key Characteristics of Vector:
Thread-Safe: Unlike ArrayList, Vector is synchronized, making it suitable for multi-threaded environments.
Dynamic Resizing: It grows automatically when needed, usually doubling its size (unlike ArrayList, which increases by 50%).
Slow Performance: Because of synchronization, Vector is slower compared to ArrayList in a single-threaded environment.
Allows Duplicates & Maintains Order: It supports duplicate elements and retains the insertion order.
Indexed Access: Like ArrayList, it allows fast random access using an index

*/

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // 1. Creating a Vector
        Vector<String> vector = new Vector<>();

        // 2. Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // 3. Inserting at a specific index
        vector.add(1, "Grapes");

        // 4. Accessing an element
        System.out.println("Element at index 2: " + vector.get(2));

        // 5. Updating an element
        vector.set(1, "Blueberry");

        // 6. Removing elements
        vector.remove("Banana");  // Removes by value
        vector.remove(0);         // Removes by index

        // 7. Checking if an element exists
        System.out.println("Contains 'Cherry': " + vector.contains("Cherry"));

        // 8. Getting the size of the Vector
        System.out.println("Size of vector: " + vector.size());

        // 9. Iterating using for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // 10. Clearing all elements
        vector.clear();
        System.out.println("Is vector empty? " + vector.isEmpty());
    }
}

/*
Differences Between ArrayList and Vector
Feature	                    ArrayList    	                           Vector
Synchronization	        Not synchronized	                Synchronized (thread-safe)
Performance	Faster (better for single-threaded)	            Slower due to synchronization
Growth Rate	            Increases by 50%	                        Doubles in size
Thread Safety	                No	                                    Yes
Usage	        Preferred in single-threaded applications	    Used in multi-threaded applications
*/
