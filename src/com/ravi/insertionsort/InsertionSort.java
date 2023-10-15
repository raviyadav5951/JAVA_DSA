package com.ravi.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int  inputArray[]={9,1,8,2,7,3,6,5,4};
        System.out.println(Arrays.toString(inputArray));
        selectionSort(inputArray);
    }

    private static void selectionSort(int[] array) {
      //  int  inputArray[]={9,1,8,2,7,3,6,5,4};
        for (int i = 1; i < array.length; i++) {
            int temp=array[i];
            int j=i-1;
            while (j>=0 && array[j]>temp){
                //swap
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
