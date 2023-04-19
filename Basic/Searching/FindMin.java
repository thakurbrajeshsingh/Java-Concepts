package Basic.Searching;

public class FindMin {
    public static void main(String[] args) {
        int[] arr  = {1,4,2,6,9,5,3};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums){
        int min=nums[0];
        if(nums.length==0){
            return -1;
        }
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}
