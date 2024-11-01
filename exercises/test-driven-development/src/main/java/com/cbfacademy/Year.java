package com.cbfacademy;

public class Year {

    // Method to check if the year is a leap year
    public boolean isLeap(int year) {
        // Check if the year is divisible by 400
        if (year % 400 == 0) {
            return true; // Leap year
        }
        // Check if the year is divisible by 100 but not by 400
        if (year % 100 == 0) {
            return false; // Not a leap year
        }
        // Check if the year is divisible by 4 but not by 100
        if (year % 4 == 0) {
            return true; // Leap year
        }
        // All other years are not leap years
        return false;
    }

    // Main method for manual testing
    public static void main(String[] args) {
        Year yearChecker = new Year();

        // Test cases
        int[] testYears = { 1700, 1800, 1900, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011 };

        for (int year : testYears) {
            boolean isLeap = yearChecker.isLeap(year);
            System.out.printf("Year %d: %b%n", year, isLeap);
        }
    }
}
