package com.sushank.dsa.arrays;

import java.util.Arrays;

public class CreateTwoDimension {

    public static void main(String[] args) {
        int[][] intArray = new int[2][2];

        // Assign values using nested for loops
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        System.out.println("Array length: " + intArray.length);
        System.out.print("Elements of array: " + Arrays.deepToString(intArray));
    }
}
