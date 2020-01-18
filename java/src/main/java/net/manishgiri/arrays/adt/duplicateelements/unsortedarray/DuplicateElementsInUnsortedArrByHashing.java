package net.manishgiri.arrays.adt.duplicateelements.unsortedarray;

import java.util.Arrays;
import java.util.Random;

/**
 * Use a separate Hash Table to keep track of how many elements are duplicated
 * and how many times each element is duplicated
 * Space - O(n)
 * Time - O(n)
 */
public class DuplicateElementsInUnsortedArrByHashing {


    private static void findDuplicateElementsByHashing(int[] arr) {
        // create new hash table of size = largest int in arr +1
        int maxElement = Arrays.stream(arr).max().getAsInt();
        int[] H = new int[maxElement+1];

        // increment value in indices of H such that val at arr[i] = H[val]++
        for (int i = 0; i < arr.length; i++) {
            H[arr[i]]++;
        }

        // for every element in H, if value at idx X is greater than 1, X is a duplicate element
        // and H[X] is the number of times it's duplicated
        for (int i = 0; i < H.length; i++) {
            if(H[i] > 1) {
                System.out.printf("%d is duplicated %d times\n", i, H[i]);
            }
        }

    }
    public static void main(String[] args) {
        int[] nums = new int[30];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(nums));

        findDuplicateElementsByHashing(nums);
    }
}

/*

OUTPUT -

[19, 5, 44, 21, 26, 31, 5, 21, 36, 49, 2, 30, 10, 34, 5, 15, 34, 42, 4, 45, 14, 37, 16, 36, 41, 15, 11, 35, 37, 12]
5 is duplicated 3 times
15 is duplicated 2 times
21 is duplicated 2 times
34 is duplicated 2 times
36 is duplicated 2 times
37 is duplicated 2 times

*/