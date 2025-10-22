package com.sushank.dsa.arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Examples
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] inputArray = {2,7,11,15};
        int target = 9;
        int[] indexes = twoSum(inputArray, target);
        System.out.println("Two Sun: " + Arrays.toString(indexes));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] indexes = new int[0];

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(indexMap.containsKey(complement)) {
                indexes = new int[]{indexMap.get(complement), i};
            }
            indexMap.put(nums[i], i);
        }
        return indexes;
    }
}
