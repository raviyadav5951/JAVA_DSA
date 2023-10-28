package com.ravi.patterns;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern1 {

// *****
// *****
// *****
// *****
// *****

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
        pattern4(5);
    }

    /**
     *     *****
     *     *****
     *     *****
     *     *****
     *     *****
     * @param n
     */

    private static void pattern1(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     * @param n
     */
    private static void pattern2(int n) {

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     */

    private static void pattern3(int n) {

        for (int row = 1; row <=n ; row++) {
            for (int col = 0; col <=n-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /**
     *     1
     *     1 2
     *     1 2 3
     *     1 2 3 4
     *     1 2 3 4 5
     */

    private static void pattern4(int n) {

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

}
