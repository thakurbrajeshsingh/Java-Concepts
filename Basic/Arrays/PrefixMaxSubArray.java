package Basic.Arrays;

public class PrefixMaxSubArray {

    public static void prefixMaxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
//        calculate prefix array
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = 0; j < arr.length; j++) {
                int end=j;
            }
        }
    }

    public static void main(String[] args) {

    }


}
