package com.ravi.recursion_easy;

public class SumOfDigits {

    public static void main(String[] args) {
        
        int n=1342;

        System.out.println(sumOfdig(n));
    }

    private static int sumOfdig(int n) {

        //last digit + remaining number

        //last digit =n%10
        //remaining number =n/10;

        if(n<=0){return 0;}
        return n%10+sumOfdig(n/10);
    }
}
