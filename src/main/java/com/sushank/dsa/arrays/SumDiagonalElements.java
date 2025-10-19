package com.sushank.dsa.arrays;

public class SumDiagonalElements {

    public static void main(String[] args) {
        int[][] inputArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = sumDiagonalElements(inputArray);
        System.out.println("Sum of diagonal elements: " + sum);
    }

    public static int sumDiagonalElements(int[][] inputArray) {
        int sum = 0;
        for (int i=0; i < inputArray.length; i++ ) {
            sum += inputArray[i][i];
        }
        return sum;
    }
}
