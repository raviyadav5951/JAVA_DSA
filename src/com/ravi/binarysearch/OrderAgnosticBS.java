package com.ravi.binarysearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int ascarr[] = {99, 80, 64, 55, 48, 34, 33, 29, 10, 0, 1};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 29;
        int answer = orderAgnosticBinarySearch(ascarr, target);
        System.out.println(answer);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        //find whether array is sorted in descending/ascending
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
