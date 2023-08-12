package com.ravi.linearsearch;



public class SearchInStrings {

    public static void main(String[] args) {
        String name="Hello World";
        char target='d';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }

    static boolean search(String inputStr,char targetChar){
        if(inputStr.length()==0){
            return false;
        }else{

            for(int index=0;index<inputStr.length();index++){
                if(inputStr.charAt(index)==targetChar){
                    return true;
                }
            }
        }

        return false;
    }
    static boolean search2(String inputStr,char targetChar){
        if(inputStr.length()==0){
            return false;
        }else{
            for(char ch : inputStr.toCharArray() ){
                if(ch==targetChar){
                    return true;
                }
            }
        }

        return false;
    }

}
