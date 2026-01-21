package com.sushank.coding.interview.patterns.twopointers;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2};
        int result = removeDuplicates(inputArray);
        System.out.println("Length of array after removing duplicates " + result);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int posLastUniqueElement = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[posLastUniqueElement]) {
                posLastUniqueElement++;
                nums[posLastUniqueElement] = nums[j];
            }
        }
        return posLastUniqueElement + 1;
    }
}
