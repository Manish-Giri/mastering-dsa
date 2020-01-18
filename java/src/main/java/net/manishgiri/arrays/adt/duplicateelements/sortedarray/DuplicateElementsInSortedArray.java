package net.manishgiri.arrays.adt.duplicateelements.sortedarray;

/**
 * In a sorted array, compare each element with next - A[i] <-> A[i+i]
 * if next element is a duplicate element, start a for loop from next element
 * going forward until the current element is same as original duplicate A[i]
 * When no more duplicate found, bring i over to j -1 (element with no more
 * repeating duplicate
 */
public class DuplicateElementsInSortedArray {

    private static void findDuplicateElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if(arr[i] == arr[i+1]) {

                // find and print subsequent duplicates, if any
                int j, k = 0; // k is for counting how  many repeated duplicates of same element
                for (j = i+1; arr[j] == arr[i]; j++) {
                    System.out.println("Duplicate Element #" + ++k + ": " + arr[j]);
                }

                // bring i over to last duplicate element
                i = j -1;
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {3,5,6,7,8,8,8,9,10,11,12,15,15,15,15,15,15,18,20};
        findDuplicateElements(numbers);

    }
}
