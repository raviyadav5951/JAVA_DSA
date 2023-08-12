package com.ravi.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array={3,6,2,1,19,99,45,67,56};
        int target=45;
        int answer=linearSearch(array,target);

        System.out.println("answer is:"+answer);
    }

    static int linearSearch(int [] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
