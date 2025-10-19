package com.sushank.dsa.arrays;

/* Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.
Array may contain duplicates.

Example
myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
*/

import java.util.Arrays;

public class TopTwoBestScore {

    public static void main(String[] args){
        int[] inputArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] result = findTopTwoScores(inputArray);
        System.out.println("Top Two Best Scores: " + Arrays.toString(result));
    }

    public static int[] findTopTwoScores(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return new int[]{first, second};
    }
}
