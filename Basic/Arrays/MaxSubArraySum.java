package Basic.Arrays;

public class MaxSubArraySum {

    public static int maxSubArraySum(int[] arr) {

        int currMax = 0;
        int subMax = Integer.MIN_VALUE;
        //for start value
        for (int i = 0; i < arr.length; i++) {
            int start = i;
//            for end value
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currMax=0;
                for (int k = start; k <= end; k++) {
                    currMax = arr[k] + currMax;
                }
            }
            if (subMax < currMax) {
                subMax = currMax;
            }
        }
        return subMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int ans = maxSubArraySum(arr);
        System.out.println(ans);
    }
}
