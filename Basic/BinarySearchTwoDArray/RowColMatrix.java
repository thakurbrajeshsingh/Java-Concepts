package Basic.BinarySearchTwoDArray;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {

        int[][] arr ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},

        };
//        System.out.println(Arrays.toString(search(arr,37)));

        System.out.println(arr[0].length);
        System.out.println(arr.length);

    }

    static int[] search(int[][] matric,int target){
        int r=0;
        int c= matric.length-1;


        while(r<matric.length && c>=0){

            if (matric[r][c] == target) {
                return new int[]{r,c};
            } else if (matric[r][c]<target) {
                r++;
            }else {
                c--;
           }
        }

        return new int[]{-1,-1};


    }



}

