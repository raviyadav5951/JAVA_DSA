package com.ravi.bubblesort;

import java.util.Arrays;

//https://www.youtube.com/watch?v=F5MZyqRp_IM&t=2241s
//Case 1: Sorting the array
//Case 2: Already sorted array is provided
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {21, 31, 4, 5, 43, 2};
//        int[] arr = {-1,-32,-23,0,3,4,7};
        // int[] arr = {1,2,3,4,5};
        // int []arr={};
//        int []arr={1};


        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {

        //outer loop to count step/pass
        //for each pass we will compare the elements

        //After each step we will get the largest element at the end,
        //so we don't need to compare the last element after first step (i.e compare till size-i)
        // int []arr={21,31,4,5,43,2};

        //If already sorted array is provided then it will traverse for every step
        //so we detect if in first pass no swap happens then already its sorted array
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                //swap if current element is less than previous element
                if (arr[j] < arr[j - 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if (!swapped) {
                //not false means true
                //break from first iteration
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
