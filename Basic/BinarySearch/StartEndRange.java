package Basic.BinarySearch;

import java.util.Arrays;

public class StartEndRange {
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,8,10};
        int[] ans= SearchRange(nums,8);
        System.out.println(Arrays.toString(ans));



    }
    static int[] SearchRange(int[] nums, int target) {
    int [] ans={-1,-1};
        ans[0]= SearchIndex(nums,target,true);
        if(ans[0] != -1) {
            ans[1] = SearchIndex(nums, target, false);
        }
        return ans;
    }
     static int SearchIndex(int[] nums,int target,boolean startIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start + (end-start)/2;
            if(target<nums[middle]){
                end = middle-1;
            } else if (target>nums[middle]) {
                start = middle+1;
            }else {
                ans=middle;
                if(startIndex){
                    end = middle-1;
                }else {
                    start=middle+1;
                }
            }
        }
        return ans;
    }


}
