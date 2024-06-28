package com.cbfacademy;

import java.util.*;

public class CollectionsExercise {

    public LinkedList<Integer> useLinkedList() {
        // Create an empty LinkedList
        LinkedList<Integer> integers = new LinkedList<>();

        // Add 4 as the first element of the list
        integers.add(4);

        // Add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);

        // Add another 2 as the last element of the list
        integers.add(2);

        // Add 4 as the 3rd element of the list
        integers.add(2, 4); // List is zero-indexed, so 2 is the 3rd position

        // Invoke the method getFirst() on the list (head element) and print the result
        Integer headElement = integers.getFirst();
        System.out.println(headElement);

        // Return the list
        return integers;
    }

    // public Stack<Integer> useStack() {
    //     // Create an empty stack
    //     Stack<Integer> stack = new Stack<>();

    //     // Add 5, 6, 8, 9 to the stack
    //     stack.push(5);
    //     stack.push(6);
    //     stack.push(8);
    //     stack.push(9);

    //     // Print the first element of the stack (top of the stack)
    //     System.out.println("First element: " + stack.peek());

    //     // Print the last element of the stack (bottom of the stack)
    //     System.out.println("Last element: " + stack.firstElement());

    //     // Invoke the method pop() on the stack and print the result
    //     Integer poppedElement = stack.pop();
    //     System.out.println("Popped element: " + poppedElement);

    //     // Invoke the push(4) method on the stack
    //     stack.push(4);

    //     // Return the stack
    //     return stack;
    // }

    // public ArrayDeque<Integer> useArrayDeque() {
    //     // Create an empty arrayDeque
    //     ArrayDeque<Integer> deque = new ArrayDeque<>();

    //     // Add 5, 6, 8, 9 to the queue
    //     deque.add(5);
    //     deque.add(6);
    //     deque.add(8);
    //     deque.add(9);

    //     // Print the first element of the queue
    //     System.out.println("First element: " + deque.getFirst());

    //     // Print the last element of the queue
    //     System.out.println("Last element: " + deque.getLast());

    //     // Invoke the method poll() on the queue and print the result
    //     Integer polledElement = deque.poll();
    //     System.out.println("Polled element: " + polledElement);

    //     // Invoke the element() method on the queue and print the result
    //     Integer firstElement = deque.element();
    //     System.out.println("Element method result: " + firstElement);

    //     // Return the queue
    //     return deque;
    // }

    // public HashMap<Integer, String> useHashMap() {
    //     // Create an empty hash map
    //     HashMap<Integer, String> map = new HashMap<>();

    //     // Add entries to the map
    //     map.put(1, "TypeScript");
    //     map.put(2, "Kotlin");
    //     map.put(3, "Python");
    //     map.put(4, "Java");
    //     map.put(5, "JavaScript");
    //     map.put(6, "Rust");

    //     // Determine the set of keys from the map and print it
    //     System.out.println("Keys: " + map.keySet());

    //     // Determine the set of values from the map and print it
    //     System.out.println("Values: " + map.values());

    //     // Determine whether the map contains "English" as a language and print the result
    //     boolean containsEnglish = map.containsValue("English");
    //     System.out.println("Contains 'English': " + containsEnglish);

    //     // Return the map
    //     return map;
    // }
}
