package Basic.BinarySearch;

import java.util.Arrays;

public class Basic {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,9};
//        System.out.println(binarySearch(nums,19));

        System.out.println(1/2);
    }
     static int binarySearch(int[] nums,int target){




        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(target<nums[middle]){
                end = middle -1;
            } else if (target>nums[middle]) {
                start = middle+1;
            }
            else {
                return middle;
            }
        }
        return -1;
     }
}
