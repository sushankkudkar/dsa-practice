package com.sushank.dsa.arrays;

/*
48. Rotate Image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

import java.util.Arrays;

public class MatrixClockwiseRotation {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateClockwiseInPlace(matrix);
    }
    public static void rotateClockwiseInPlace(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int j = first; j < last; j++) {
                int offset = j - first;

                // saved topmost element
                 int top = matrix[first][j];

                // left to top
                matrix[first][j] = matrix[last - offset][first];

                // bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right to bottom
                matrix[last][last - offset] = matrix[j][last];

                // top to right
                matrix[j][last] = top;
            }
        }
        System.out.println("Clockwise Rotated Matrix: " + Arrays.deepToString(matrix));

    }
}
