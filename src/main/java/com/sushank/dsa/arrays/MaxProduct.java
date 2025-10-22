package com.sushank.dsa.arrays;


/*
Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.

Example
int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50)
*/

public class MaxProduct {

    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        String result = maxProduct(intArray);
        System.out.println("MaxProduct: " + result);
    }

    public static String maxProduct(int[] intArray) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: intArray) {
            if(num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if(num > secondMax) {
                secondMax = num;
            }
        }
        return  firstMax + "," + secondMax;
    }
}
