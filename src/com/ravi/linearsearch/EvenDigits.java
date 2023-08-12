package com.ravi.linearsearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {

        int[] arr={12,345,2,6,7896,3456};
        System.out.println("Count of numbers(even) from array:"
                +findNumbers(arr));

    }

    static int findNumbers(int[] arr){
        int count=0;
        for (int index = 0; index <arr.length ; index++) {
            if(even(arr[index])){
                count++;
            }
        }
        return count;

    }

    //return the boolean
    private static boolean even(int number) {
        //1: count number of digits
        //2: convert to string and count length
        int numOfDigits=digits2(number);
        if(numOfDigits %2 ==0){
            return true;
        }
        return false;
    }

    //return the count of digits in each number
    static int digits(int number){
        int num_of_digits=0;
        if(number<0){
            number=number*-1;
        }

        while(number>0){
            num_of_digits++;
            number=number/10;
        }
        return num_of_digits;
    }

    static int digits2(int number){
        if(number<0){
            number=number*-1;
        }

        return (int)(Math.log10(number))+1;
    }



}
