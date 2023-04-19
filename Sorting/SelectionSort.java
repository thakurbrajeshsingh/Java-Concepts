package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }
    }

    static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }


}
