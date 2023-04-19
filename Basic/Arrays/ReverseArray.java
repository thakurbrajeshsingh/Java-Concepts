package Basic.Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start < end) {
//            swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
