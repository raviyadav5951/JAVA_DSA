package com.ravi.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    //Input: nums = [4,3,2,7,8,2,3,1] //1 to N
    //element at position correct=index-1
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer>output=new ArrayList<>();
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

        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index+1){
                output.add(arr[index]);
            }
        }

        return output;
    }

    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
