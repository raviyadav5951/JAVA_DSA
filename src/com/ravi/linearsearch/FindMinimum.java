package com.ravi.linearsearch;

public class FindMinimum {
    public static void main(String[] args) {
        int inputArray[]={18,3,-7,123,14,28};
        //Find Minimum number from array
        System.out.println(min(inputArray));
    }

    private static int min(int[] inputArray) {
        int ans=inputArray[0];
        for (int index = 1; index <inputArray.length ; index++) {

            if(inputArray[index]<ans){
                ans=inputArray[index];
            }
        }
        return ans;
    }

}
