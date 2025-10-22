package com.sushank.dsa.arrays;

/*
Permutation
Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example
int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output:true
 */

import java.util.HashMap;
import java.util.Map;

public class Permutation {

    public static void main(String[] args) {
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = {5,1,2,3,4};
        boolean permutataionCheck = checkPermutation(intArray1, intArray2);
        System.out.println("Is array permutation of each other : " + permutataionCheck);
    }

    public static boolean checkPermutation(int[] array1, int[] array2){
        Map<Integer, Integer> storeArray = new HashMap<>();

        for(int num : array1) {
            storeArray.put(num, storeArray.getOrDefault(num, 0) + 1);
        }

        for(int num : array2) {
            if(!storeArray.containsKey(num)) return false;
            storeArray.put(num, storeArray.get(num) - 1);
        }

        return storeArray.values().stream().allMatch(v -> v == 0);
    }
}
