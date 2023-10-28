package com.ravi.recursion_easy;

public class PrintNto1 {

    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {

        //base condition to exit the loop
        if(n==0){return;}
        System.out.println(n);
        fun(n-1);
    }
}
