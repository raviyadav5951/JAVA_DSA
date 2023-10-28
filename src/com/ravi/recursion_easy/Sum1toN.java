package com.ravi.recursion_easy;

public class Sum1toN {

    public static void main(String[] args) {
        int n=5;
        System.out.println(sum1toN(n));
    }

    private static int sum1toN(int n) {

        if(n<=1){ return 1;}
        return n+sum1toN(n-1);

    }
}
