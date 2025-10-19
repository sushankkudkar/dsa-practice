package com.sushank.dsa.arrays;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2};
        int result = removeDuplicates(inputArray);
        System.out.println("Length of array after removing duplicates " + result);
    }

    public static int removeDuplicates(int[] nums) {
        /*
        This code removes duplicates by converting nums to a HashSet via streams.
        It first boxes the int[] to Integer[] because collections can't hold primitives.
        Then it converts the HashSet back to int[] using mapToInt and toArray().
        The approach creates a **new array** instead of modifying the original in-place.
        Also, using HashSet may **change the relative order** of elements in nums.

        nums = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)))
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return  nums.length;
         */

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
