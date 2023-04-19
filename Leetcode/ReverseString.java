package Leetcode;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String[] str = {"h", "e", "l", "l", "o"};
        revString(str);
        System.out.println(Arrays.toString(str));
    }

    static String[] revString(String[] str) {

        int i = 0;
        int j = str.length;

        while (i < j) {
            swap(str[i], str[j - 1]);
            i++;
            j--;
        }
        return str;

    }


    static void swap(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }


}
