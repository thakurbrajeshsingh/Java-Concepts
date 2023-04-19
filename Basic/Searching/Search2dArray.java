package Basic.Searching;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {

        int[][] arr ={
                {33,6,9,1},
                {2,7,3},
                {8,2,73,0,1},
                {55,7,82,92}
        };
        int target = 2;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                 return  new int[]{row, col};

                }
            }
        }
        return  new int[]{-1,-1};
    }
}
