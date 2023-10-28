package com.ravi.patterns;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern30 {
    /**
     *             1
     *           2 1 2
     *         3 2 1 2 3
     *       4 3 2 1 2 3 4
     *     5 4 3 2 1 2 3 4 5
     * @param args
     */

    public static void main(String[] args) {
        pattern30(5);
    }

    private static void pattern30(int n) {

        for (int row = 0; row <2*n ; row++) {
            int totalColsInRow= row>n?2*n-row:row;
            int totalSpaces=n-totalColsInRow;

            for(int i=0;i<totalSpaces;i++){
                System.out.print(" ");
            }
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <=n ; row++) {
            //add spaces

            for (int space = 0; space <n-row ; space++) {
                System.out.print("  ");
            }

            //column count  //from row number till 1
            for (int col= row; col >=1 ; col--) {
                System.out.print(col +" ");
            }
            //from 2 to row number

            for (int col = 2; col <=row ; col++) {
                System.out.print(col +" ");
            }

            System.out.println();

        }

    }
 
}
