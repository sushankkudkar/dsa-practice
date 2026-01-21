package com.sushank.coding.interview.patterns.twopointers;

/*

Triplet Sum
Medium
Given an array of integers, return all triplets [a, b, c] such that a + b + c = 0 . The solution must not contain duplicate triplets (e.g., [1, 2, 3] and [2, 3, 1] are considered duplicates). If no such triplets are found, return an empty array.

Each triplet can be arranged in any order, and the output can be returned in any order.

Example:
Input: nums = [-3, -2, -1, 0, 1, 2]
Output: [[-3, 1, 2], [-1, 0, 1]]

 */
import java.util.*;

public class TripletSum {

    public static void main(String[] args) {
        int[] nums = {-3, -2, -2, -1, -1, 0, 1, 2, 2};

        List<int[]> result = threeSum(nums);

        for (int[] triplet : result) {
            System.out.println(Arrays.toString(triplet));
        }
    }

    public static List<int[]> threeSum(int[] nums) {

        List<int[]> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate fixed element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
