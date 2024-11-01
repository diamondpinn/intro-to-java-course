package com.cbfacademy.strings;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Test the concatenate method
        System.out.println(concatenate("Hello, ", "world", "!"));

        // Test the areEqual method
        System.out.println(areEqual("test", "test"));
        System.out.println(areEqual("test", "Test"));

        // Test the format method
        System.out.println(format("Apple", 5, 1.239));
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Concatenates the input parameters and returns the result
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Determines whether the input parameters are equal strings
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        // Formats the string to show item, quantity, and price to two decimal places
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
