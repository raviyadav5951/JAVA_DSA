package com.ravi.cyclicsort;
//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    //nums = [1,2,2,4]
    public int[] findErrorNums(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){

                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }


        //finding duplicate number:(element at mismatched index will give duplicate number)
        //duplicate is element that doesn't align with index

        //finding missing number:(index will give missing number)
        //missing number that doesn't align with index+1

        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index+1){
                return new int[]{arr[index],index+1};
            }
        }

        return new int []{-1,-1};

    }

    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
