package com.ravi.string;

public class StrBuilder {
    public static void main(String[] args) {
        // Solution 1:
        //this solution will create a strings in string pool which will
        //be keep on creating on every i count increase

        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);

        // Solution 2:
        // Better solution is to use string builder
        // this will  update the same variable
        //it will not create a new variable every time
        StringBuilder builder=new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
