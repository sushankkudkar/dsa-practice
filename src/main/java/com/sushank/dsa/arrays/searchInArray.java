package com.sushank.dsa.arrays;

/*
Finding a Number in an Array
Write a program to check if an array contains a number in Java.

int[] intArray = {1,2,3,4,5,6};
searchInArray(intArray, 6); // 5
*/

public class searchInArray {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6};
        int result = search(inputArray, 6);
        System.out.println("Index of element in array: " + result);
    }

    public static int search(int[] intArray, int valueToSearch) {
        int low = 0;
        int high = intArray.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if( intArray[mid] == valueToSearch) {
                return mid;
            } else if(intArray[mid] < valueToSearch ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
