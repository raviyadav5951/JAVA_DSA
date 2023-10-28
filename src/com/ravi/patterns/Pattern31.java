package com.ravi.patterns;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern31 {
    /**
     *          4 4 4 4 4 4 4
     *          4 3 3 3 3 3 4
     *          4 3 2 2 2 3 4
     *          4 3 2 1 2 3 4
     *          4 3 2 2 2 3 4
     *          4 3 3 3 3 3 4
     *          4 4 4 4 4 4 4
     * @param args
     */

    //Check the minimum distance from left,right, up and down
    // up= row
    //down= N-row
    //left= col
    //right= N-col


    public static void main(String[] args) {
        pattern31(4);
    }

    private static void pattern31(int n) {
        int originalIndex=n;
        n=2*n;
        for (int row = 0; row <n ; row++) {

            for (int col = 0; col < n; col++) {

                int atEveryIndex= originalIndex-
                        Math.min(Math.min(row,col), Math.min(n-row,n-col));

                System.out.print(atEveryIndex+" ");
            }
            System.out.println();

        }



    }
 
}
