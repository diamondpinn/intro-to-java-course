package com.cbfacademy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // Create a new list to store the results
        List<String> result = new ArrayList<>();
        
        // Iterate over each element in the input list
        for (Integer number : numbers) {
            // Check if the number is divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (number % 3 == 0) {
                result.add("Fizz");
            }
            // Check if the number is divisible by 5
            else if (number % 5 == 0) {
                result.add("Buzz");
            }
            // If none of the above conditions are met, add the number itself
            else {
                result.add(number.toString());
            }
        }
        
        // Return the constructed list
        return result;
    }

    public String whichMonth(Integer number) {
        // Use a switch statement to determine the month based on the input number
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // Create and initialize a list of numbers from 1 to 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // Variables to hold the sums of even and odd numbers
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        // Determine the sums of even and odd numbers
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                sumOfOdds += number;
            }
        }

        // Return the result map
        return Map.of("SumOfEvens", sumOfEvens, "SumOfOdds", sumOfOdds);
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Create a new list to hold the reversed elements
        List<Integer> reversedList = new ArrayList<>();
        
        // Iterate over the input list in reverse order and add elements to the new list
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedList.add(numbers.get(i));
        }
        
        // Return the reversed list
        return reversedList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }

    public static void main(String[] args) {
        FlowControlExercises exercises = new FlowControlExercises();

        // Example usage of the fizzBuzz method
        List<Integer> fizzBuzzNumbers = List.of(1, 3, 5,  8, 9, 10, 12, 13, 15, 16);
        List<String> fizzBuzzResult = exercises.fizzBuzz(fizzBuzzNumbers);
        System.out.println("FizzBuzz: " + fizzBuzzResult);  // Output: [1, Fizz, Buzz, FizzBuzz, 16]

        // Example usage of the whichMonth method
        System.out.println("Month 1: " + exercises.whichMonth(1));  // Output: January
        System.out.println("Month 12: " + exercises.whichMonth(12)); // Output: December
        System.out.println("Month 0: " + exercises.whichMonth(0));  // Output: Invalid month number
        System.out.println("Month 13: " + exercises.whichMonth(13)); // Output: Invalid month number

        // Example usage of the sumOfOddsAndSumOfEvens method
        Map<String, Integer> sumResult = exercises.sumOfOddsAndSumOfEvens();
        System.out.println("Sum of Evens and Odds: " + sumResult);  // Output: {SumOfEvens=2550, SumOfOdds=2500}

        // Example usage of the reverse method
        ArrayList<Integer> reverseNumbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> reversedResult = exercises.reverse(reverseNumbers);
        System.out.println("Reversed: " + reversedResult);  // Output: [5, 4, 3, 2, 1]
    }
}

