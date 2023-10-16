package com.ravi.cyclicsort;
//https://leetcode.com/problems/first-missing-positive/

//ignore negatives and N
public class FirstPositiveMissingNumber {

    //after sorting if {1,2,3,4}
    //then return N+1
    //because every number is at its position then first missing is arr.length+1

    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        //missing first positive

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
