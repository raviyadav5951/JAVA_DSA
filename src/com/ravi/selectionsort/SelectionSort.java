package com.ravi.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int []arr={5,4,2,1,3,0};
        selectionSort(arr);
    }
    //Selecting the largest element and push to end
    //For each step ignore n-i position because last element is already at end so waste to compare the last
    //element
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max element in the array
            int lastIndex=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,lastIndex);

            //swapping maxIndex with last index
            swapArray(arr,maxIndex,lastIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = 0; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    private static void swapArray(int [] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
