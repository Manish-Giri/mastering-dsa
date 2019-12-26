package net.manishgiri.arrays.adt.multiplemissingelements;

import java.util.Arrays;

/**
 * given an unsorted array, find all missing elements
 * create a new boolean array of size -> 0 to largest element in given array, set all elements to false
 * for each element in given array -> go to that index in new array, and set it to true
 * then, for: new array (starting w/ least element in given array) -> if element is still false, it is missing element
 * in given array
 * Complexity -> Time: O(n), since iterating through given array & new array -> O(n) + O(n), and constant
 * time for lookups
 * Space: O(n), since a new array (hashtable/bitset) of size =/> given array is created
 */
public class MultipleMissingUnsortedArray {

    private static void printMissingElements(int[] arr) {
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt();
        boolean[] map = new boolean[high+1];

        // loop over arr, mark elements present as true in new array
        for (int i = 0; i < arr.length ; i++) {
            map[arr[i]] = true;
        }

        // loop over new array, starting from first element in given array, and check if missing
        for (int i = low; i <= high ; i++) {
            if(!map[i]) {
                System.out.println("Missing element: " + i);
            }
        }

    }

    public static void main(String[] args) {
        int SIZE = 15;
        int[] nums = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            nums[i] = (int)(Math.random()*50) + 1;
        }
        System.out.println("Array: " + Arrays.toString(nums));
        printMissingElements(nums);
    }
}
