package org.example;

public class revString {
    public static String rev(String str){
        StringBuilder strB= new StringBuilder(str);
        int i=0, j= str.length()-1;
        while(i<j){
            char temp= strB.charAt(i);
            strB.setCharAt(i, strB.charAt(j));
            strB.setCharAt(j, temp);
            i++;
            j--;
        }
        return strB.toString();
    }
}
