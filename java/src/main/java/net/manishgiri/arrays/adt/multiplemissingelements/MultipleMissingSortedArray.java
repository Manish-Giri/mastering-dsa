package net.manishgiri.arrays.adt.multiplemissingelements;

import java.util.Arrays;

public class MultipleMissingSortedArray {

    /**
     * Given a sorted array of elements with multiple missing elements, print the missing elements
     * if diff b/w element and index is not equal to prev difference
     * loop: while diff is not equal -> print missing element and increment difference
     * Complexity -> Time: O(n)
     * @param arr
     */
    private static void printMultipleMissingElements(int[] arr) {
        int curr_diff = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int actual_diff = arr[i] - i;
            if(curr_diff != actual_diff) {
                while (curr_diff != actual_diff) {
                    System.out.println("Missing element: " + (curr_diff + i));
                    curr_diff++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[11];
        for (int i = 0, j = 6; i <= 10 ; i++, j++) {
            if(j == 10) {
                j++;
            }
            else if(j == 13) {
                j += 2;
            }
            nums[i] = j;
        }

        System.out.println("Array: " + Arrays.toString(nums));
        printMultipleMissingElements(nums);
    }
}
