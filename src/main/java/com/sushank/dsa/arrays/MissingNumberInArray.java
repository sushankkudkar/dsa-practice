package com.sushank.dsa.arrays;

/*
Missing Number
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:

Use the formula (n * (n + 1)) / 2 which calculates the sum of the first n natural numbers.
*/


public class MissingNumberInArray {

    public static void main(String[] args){
        int[] inputArray = {1,2,3,4,6};
        int missingElement = findMissingNumberInArray(inputArray);
        System.out.println("Missing element in array: " + missingElement);
    }
    static int findMissingNumberInArray(int[] inputArray) {

        int maxElement = inputArray[inputArray.length - 1];
        int actualSum = (maxElement * (maxElement + 1)) / 2;
        for (int nums : inputArray) {
            actualSum -= nums;
        }
        return actualSum;
    }
}
