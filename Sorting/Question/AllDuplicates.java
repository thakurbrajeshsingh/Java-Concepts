package Sorting.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//442. Find All Duplicates in an Array(leetcode)
public class AllDuplicates {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
//        just find missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
