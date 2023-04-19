package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] nums = {5, 4, 2, 3, 1};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }


    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1 ]) {
                    swap(nums, j,j-1);
                } else {
                    break;
                }
            }
        }
    }


    static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}