package com.sushank.dsa.arrays;

import java.util.Arrays;

public class Reverse {
    public static void reverseSortedArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseSortedArray(arr);
        System.out.println("Reversed Sorted Array: " + Arrays.toString(arr));
    }
}
