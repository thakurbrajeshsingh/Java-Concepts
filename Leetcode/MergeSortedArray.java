package Leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {


        int i=2;
        int j=2;
        if(i>j){
            System.out.println("i great");
        }else {
            System.out.println("j great");
        }


    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

    while( nums1.length>0){
        int i=0;
        nums1[m]=nums2[i];
        m++;
        i++;
    }



    }



}
