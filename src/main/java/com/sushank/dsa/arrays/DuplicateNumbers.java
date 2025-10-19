package com.sushank.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Duplicate Number
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]
*/

public class DuplicateNumbers {

    public static void main(String[] args) {
        int[] inputArray = {1, 1, 2, 2, 3, 4, 5};
        int[] uniqueArray = removeDuplicates(inputArray);
        System.out.println("Unique Elements of Array: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] inputArray) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int j : inputArray) {
            uniqueSet.add(j);
        }
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
