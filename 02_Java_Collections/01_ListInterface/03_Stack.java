/*
Stack in Java
A Stack in Java is a Last In, First Out (LIFO) data structure, meaning the last element added is the first one removed. It is part of java.util and extends the Vector class.

Key Characteristics of Stack:
LIFO (Last In, First Out): The last inserted element is removed first.
Thread-Safe: Since it extends Vector, it is synchronized.
Dynamic Size: It grows automatically when needed.
Provides Built-in Methods for Stack Operations: Includes push(), pop(), peek(), isEmpty(), etc.
*/

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // 1. Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // 2. Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // 3. Accessing the top element without removing (peek)
        System.out.println("Top element (peek): " + stack.peek());

        // 4. Removing (popping) the top element
        System.out.println("Popped element: " + stack.pop());

        // 5. Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 6. Searching for an element (returns position from top, or -1 if not found)
        System.out.println("Position of 20: " + stack.search(20));

        // 7. Iterating over Stack elements
        System.out.println("Stack elements:");
        for (int num : stack) {
            System.out.println(num);
        }

        // 8. Clearing all elements
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
/*
push(E e)	Adds an element to the top of the stack.
pop()	Removes and returns the top element.
peek()	Returns the top element without removing it.
isEmpty()	Checks if the stack is empty.
search(E e)	Searches for an element (returns position from the top, or -1 if not found).
clear()	Removes all elements from the stack.
*/
