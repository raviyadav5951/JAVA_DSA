package com.ravi.linearsearch;

import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {


    public static int maximumWealth(int[][] accounts) {

            int ans=Integer.MIN_VALUE;

            for (int person = 0; person < accounts.length; person++) {
                int sum = 0;
                for (int account = 0; account < accounts[person].length; account++) {
                    sum = sum + accounts[person][account];
                }
                if(sum>ans){
                    ans=sum;
                }
            }
            return ans;
    }

    public static void main(String[] args) {
        int wealth[][] = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println("Max==>"+maximumWealth(wealth));
    }
}
