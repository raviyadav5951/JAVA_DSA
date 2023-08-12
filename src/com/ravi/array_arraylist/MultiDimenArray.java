package com.ravi.array_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArray {
    public static void main(String[] args) {
        /**
         *      1   2   3
         *      4   5   6
         *      7   8   9
         */

        //syntax
        //Row number is mandatory because arrays are stored in the m
        //memory as 0, 1,2 and array of arrays
        Scanner in= new Scanner(System.in);


        int [][] sample2D={
                {1,2,3}, //0th index
                {4,5}, //1st index
                {6,7,8,9} //2nd index
        };

        int [][] arr= new int [3][3];
        //For input
        for (int row = 0; row < arr.length; row++) {//no of rows
            //for each column in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }

        System.out.println("going to output now====");
        //For output
//        for (int i = 0; i <arr.length ; i++) {
//
//            for(int col=0;col<arr[i].length;col++){
//                System.out.print(arr[i][col] + "");
//            }
//
//            System.out.println();
//        }

        //Second output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }




    }
}
