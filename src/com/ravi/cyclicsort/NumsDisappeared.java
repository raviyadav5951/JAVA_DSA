package com.ravi.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
class NumsDisappeared {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};//{1,2,2,3,3,4,7,8}
        List<Integer> output=findDisappearedNumbers(nums);
        System.out.println(output.toString());
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //[4,3,2,7,8,2,3,1]
        List<Integer>output=new ArrayList<>();
        int i=0;
        while(i<nums.length){

            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
               swap(nums,i,correct);
            }
            else{
                i++;

            }

        }
        //System.out.println(Arrays.toString(nums));

        //checking which numbers are not at index
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                output.add(index+1);
            }
        }
        return output;

    }
    static void swap(int []arr, int first, int second){

        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}