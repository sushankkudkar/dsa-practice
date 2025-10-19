package com.sushank.dsa.arrays;

import java.util.Arrays;

public class Create {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        // Assign values using for loops
        for(int i = 1; i<intArray.length;i++) {
            intArray[i] = i * 10;
        }

        System.out.println("Array length: " + intArray.length);
        System.out.print("Elements of array: " + Arrays.toString(intArray));
    }
}
