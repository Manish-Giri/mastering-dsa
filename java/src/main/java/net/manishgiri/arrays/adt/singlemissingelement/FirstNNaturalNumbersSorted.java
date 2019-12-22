package net.manishgiri.arrays.adt.singlemissingelement;

import java.util.Arrays;

/**
 * Find single missing element in sorted array
 * elements are from 1 to N - ie. first N natural numbers
 */
public class FirstNNaturalNumbersSorted {

    private static int findSingleMissingElement(int[] arr) {
        int sum = Arrays.stream(arr).reduce(0, Integer::sum);
        int arrMaxVal = Arrays.stream(arr).max().getAsInt();
        int sumNNaturalNumbers = (arrMaxVal*(arrMaxVal+1))/2;
        return sumNNaturalNumbers - sum;

    }

    public static void main(String[] args) {
        int[] nums = new int[12];
        for (int i = 0; i < 12 ; i++) {
            if(i == 6) {
                continue;
            }
            nums[i] = i+1;
        }

        System.out.println("Missing value in array is: " + findSingleMissingElement(nums));
    }

}
