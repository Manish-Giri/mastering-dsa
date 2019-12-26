package net.manishgiri.arrays.adt.multiplemissingelements;

import java.util.Arrays;

public class MultipleMissingSortedElements {

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
    }
}
