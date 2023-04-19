package Leetcode;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {

    int[] arr={1,2,3};
    plusOne(arr).toString();
    }



    static int[] plusOne(int[] digit){

    //  for number less then 9

    if(digit[digit.length-1]!=9){
        digit[digit.length-1]++;
        return digit;
    }
    //  for number  more then  9
    int length = digit.length;
    while (length>0 && digit[length-1]==9){
        digit[length-1]=0;
        length--;
    }
//    for array of size 1 eg [9]
        if (length <=0) {
            int[] arr =new int[digit.length+1];
            Arrays.fill(arr,0);
            arr[0]=1;
            return  arr;
        }
        else {
            digit[length-1]++;
            return digit;
        }


    }
}



