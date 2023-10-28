package com.ravi.recursion_easy;

public class OnetoN {
    public static void main(String[] args) {
        int start=1;
        int n=10;
        fun(start,n);


        //second way (funRev)
        //f5->f4->f3->f2->f1
        //and then print n

        funRev(5);
    }

    //Ravi solution
    private static void fun(int start,int n) {

        if(start>n){return;}
        System.out.println(start);
        start++;
        fun(start,n);

    }

    //second way funRev
    private static void funRev(int n){
        if(n==0){return;}
        funRev(n-1);
        System.out.println(n);

        //this will create a stack from f5 to f1 (but none executed)
        //and before coming out of the stack it will finish the f1 first,f3 second and so on
    }




}
