package com.sushank.coding.interview.patterns.twopointers;

/*
Pair Sum - Sorted
Easy
Given an array of integers sorted in ascending order and a target value, return the indexes of any pair of numbers in the array that sum to the target. The order of the indexes in the result doesn't matter. If no pair is found, return an empty array.

Example 1:
Input: nums = [-5, -2, 3, 4, 6], target = 7
Output: [2, 3]
Explanation: nums[2] + nums[3] = 3 + 4 = 7

Example 2:
Input: nums = [1, 1, 1], target = 2
Output: [0, 1]
Explanation: other valid outputs could be [1, 0], [0, 2], [2, 0], [1, 2] or [2, 1].
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int[] inputArray = {-5, -2, 3, 4, 6};
        int target = 7;

        int[] indexes = pairSum(inputArray, target);
        System.out.println("Pair Sum Result: " + Arrays.toString(indexes));
    }

    public static int[] pairSum(int[] inputArray, int target) {
        int[] results = new int[0];

        Map<Integer, Integer> map = new HashMap<>();

        return getInts(inputArray, target, results, map);
    }

    public static int[] getInts(int[] inputArray, int target, int[] results, Map<Integer, Integer> map) {
        for(int i = 0; i < inputArray.length; i++) {
            int complement = target - inputArray[i];
            if(map.containsKey(complement)) {
                results = new int[]{map.get(complement), i};
            }
            map.put(inputArray[i], i);
        }
        return results;
    }

}