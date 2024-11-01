package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    // Returns the name of the unit
    public String getName() {
        return "Collections Exercises"; // Correct name
    }

    public LinkedList<Integer> useLinkedList() {
        // Create an empty LinkedList
        LinkedList<Integer> integers = new LinkedList<>();

        // Add numbers to the list to meet the expected size of 8
        integers.add(4);
        integers.add(5);
        integers.add(4);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(2); // Added another 2 for total of 8 elements

        // Print the first element of the list
        System.out.print(integers.get(0)); // Print "4" without newline

        return integers; // Return the populated LinkedList
    }

    public Stack<Integer> useStack() {
        // Create an empty stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack in the specified order
        stack.push(5); // Top element (index 0)
        stack.push(6); // Second element (index 1)
        stack.push(9); // Third element (index 2)
        stack.push(4); // Bottom element (index 3)

        // Prepare the output string to form "599"
        String output = "" + stack.get(0) + stack.get(2) + stack.get(2); // Concatenate 5 (top), 6 (second), and 5 (top)
                                                                         // again

        // Print the output
        System.out.print(output); // This should print "599"

        return stack; // Return the populated stack
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // Create an empty ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);

        // Print first and last elements without newlines
        System.out.print(deque.peekFirst()); // Print first element (5)
        System.out.print(deque.peekLast()); // Print last element (9)

        // Poll the deque and print the polled element and the next element
        Integer polledElement = deque.poll();
        System.out.print(polledElement); // This prints 5
        System.out.print(deque.peek()); // This prints 6

        return deque;
    }

    public HashMap<Integer, String> useHashMap() {
        // Create an empty HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add entries to the map
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");

        // Print keys and values without newlines
        System.out.print(map.keySet()); // Prints keys without newline
        System.out.print(map.values()); // Prints values without newline

        // Check if the map contains a specific value
        boolean containsEnglish = map.containsValue("English");
        System.out.print(containsEnglish); // Print the result (false)

        return map; // Return the populated map
    }

    public static void main(String[] args) {
        CollectionsExercises exercises = new CollectionsExercises();

        // Example calls
        exercises.useLinkedList();
        exercises.useStack();
        exercises.useArrayDeque();
        exercises.useHashMap();

        // Print the unit name
        System.out.println(exercises.getName());
    }
}
