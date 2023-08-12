package com.ravi.binary_search_matrix;

import java.util.Arrays;

public class RowColMatrices {
    public static void main(String[] args) {
        int[][] testArray = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        int[] test = search(testArray, target);
        System.out.println(Arrays.toString(test));

    }

    ;

    //if target > last element of first row then move downward(row++) and discard complete row
    //else move to second last column of same row
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            //case 1
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            //case 2 upperbound<target then we are
            // sure that the entire row is less than the  target since this is the greatest element of entire sorted row
            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};

    }
}
