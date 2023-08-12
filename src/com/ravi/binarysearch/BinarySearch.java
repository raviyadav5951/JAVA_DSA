package com.ravi.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-18, -4, 0, 2, 4, 6, 8, 11, 13, 14, 19, 22};
        int target = 13;
        int answer = binarySearch(arr, target);

        System.out.println(answer);
    }

    //return the index
    //return -1 if target doesn't exist
    static int binarySearch(int[] arr, int target) {
        //find mid index
        //if target ==mid then return index
        // else compare target with the left or right part
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }

}
