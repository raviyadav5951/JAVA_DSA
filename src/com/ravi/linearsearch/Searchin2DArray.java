package com.ravi.linearsearch;

import java.util.Arrays;

public class Searchin2DArray {

    public static void main(String[] args) {
        int[] [] arr={
                {23,4,1},
                {12,13,14},
                {1,2,3,4,5,6},
                {4,5,6,9}
        };

        int target=14;
        int ans[]=search(arr,target);//format will be [row,col] of target element index
        System.out.println(Arrays.toString(ans));

        System.out.println("Max value:"+max(arr));
    }

    static int[] search( int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }

    static int max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
