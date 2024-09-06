package com.cbfacademy.search;

public class BinarySearch implements Search {

    @Override
    public int search(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] == target) {
                return mid;
            } else if (sortedArray[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch.search(sortedArray, target);
        System.out.println("Index of target (" + target + "): " + result);

        target = 11;
        result = binarySearch.search(sortedArray, target);
        System.out.println("Index of target (" + target + "): " + result);
    }
}
