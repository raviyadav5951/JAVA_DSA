package com.ravi.patterns;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern5 {
    /**
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * @param args
     */

    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int n) {

        for (int row = 0; row <2*n ; row++) {
            int totalColsInRow= row>n?2*n-row:row;
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
