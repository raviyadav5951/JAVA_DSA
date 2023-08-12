package com.ravi;

public class Max {
    //Store the first number as max
    //Then keep comparing the numbers in for loop with index
    //At the end you will get the max numbers

    public static void main(String[] args) {
        int []arr={1,29,3,23,100,34,56,345,1000};
        int maxNumber=max(arr);
        System.out.println("Max is:"+maxNumber);

        int maxNumberRange=maxFromRange(arr,2,7);
        System.out.println("Max is:"+maxNumberRange);
    }

    static int max(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    static int maxFromRange(int[] arr,int startIndex,int endIndex) {
        int max=arr[0];
        for (int i = startIndex; i <= endIndex; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
}
