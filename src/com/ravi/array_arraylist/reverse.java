package com.ravi.array_arraylist;

import java.util.Arrays;
//TODO: two pointer method
public class reverse {

    public static void main(String[] args) {
        int []arr={1,29,3,23,100,34,56,345,1000};

        reverse(arr);
        System.out.println("reverse array"+ Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int arr[] ,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
