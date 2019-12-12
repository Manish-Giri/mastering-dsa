package net.manishgiri.arrays.adt.merge;

import java.util.Arrays;

public class ArrayMerge {

    private static int[] mergeSortedArrays(int[] num1, int[] num2) {
        int newLength = num1.length + num2.length;
        int[] merged = new int[newLength];
        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {
            // compare elements
            if(num1[i] < num2[j]) {
                merged[k++] = num1[i++];
            }
            else {
                merged[k++] = num2[j++];
            }
        }

        // copy left over elements
        while(i < num1.length) {
            merged[k++] = num1[i++];
        }

        while(j < num2.length) {
            merged[k++] = num2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] num1 = {10, 20, 30, 40 ,50};
        int[] num2 = {15, 25, 28, 35, 45, 48, 60, 70};
        int[] merged = mergeSortedArrays(num1, num2);
        System.out.println(Arrays.toString(merged));
    }
}
