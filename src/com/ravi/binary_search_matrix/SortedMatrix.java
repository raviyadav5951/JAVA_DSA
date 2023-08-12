package com.ravi.binary_search_matrix;

import java.util.Arrays;
//https://www.youtube.com/watch?v=ZYpYur0znng
//takeuforward channel
public class SortedMatrix {

    public static void main(String[] args) {
        int[][] testArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 15;
        int[] test = search(testArray, target);
        System.out.println(Arrays.toString(test));
    }


    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if(target>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
