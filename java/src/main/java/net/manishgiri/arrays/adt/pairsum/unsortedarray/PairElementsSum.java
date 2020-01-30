package net.manishgiri.arrays.adt.pairsum.unsortedarray;

/*
 Given an array of unsorted elements, find a pair of elements which have sum equal to a given target
 Similar to Leetcode Two Sum
 Time: O(n^2) 
 */
class PairElementsSum {

    public static void main(String[] args) {
        int[] nums = {6,3,8,10,16,7,5,2,9,14};
        int target = 10;
        findPairWithSum(nums, target);
    }

    private static void findPairWithSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    System.out.printf("%d + %d = %d\n", nums[i], nums[j], nums[i]+nums[j]);
                }
            }
        }
    }

}
