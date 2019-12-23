package net.manishgiri.arrays.adt.singlemissingelement;

import java.util.Arrays;

/**
 * Uses difference between element and its index to find out missing element
 * ex: for array -> 6,7,8,9,10,11,13,14,15,16,17
 * starting with first element 6, difference between A[i] and i is 6-0=6, 7-1=6, 8-2=6 ...
 * for single missing element, find first element where diff b/w element and index is not 6
 * missing element is that index + difference that should be (6)
 */
public class SortedElements {

    private static int findSingleMissingElement(int[] nums) {

        int low = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] - i != low) {
                // missing element should be at index i
                return i + low;
            }
        }
        // not found - no missing element
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = new int[11];
        for (int i = 0, j = 6; i <= 10; i++, j++) {
            if(j == 12) {
                nums[i] = ++j;
                continue;
            }
            nums[i] = j;
        }
        System.out.println("Array is: " + Arrays.toString(nums));
        System.out.println("Missing value in array is: " + findSingleMissingElement(nums));
    }



}
