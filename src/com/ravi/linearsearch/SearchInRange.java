package com.ravi.linearsearch;

public class SearchInRange {

    public static void main(String[] args) {
        int inputArray[]={18,3,-7,123,14,28};
        //Search for 3 in the range of index[1,4]
        int target=3456;
        System.out.println("target found :"+searchInRange(inputArray,target,
                1,4));
    }

    static int searchInRange(int input[],int target, int startIndex, int endIndex){
        if(input.length==0){
            return -1;
        }
        else{
            for (int index = startIndex; index <endIndex ; index++) {
                if(input[index]==target){
                    return index;
                }
            }
        }
        return -1;

    }
}
