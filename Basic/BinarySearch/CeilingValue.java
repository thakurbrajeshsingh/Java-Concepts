package Basic.BinarySearch;

//find smallest element in array greater or = target
public class CeilingValue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(FindCeiling(arr,15));
    }

    static int FindCeiling(int[] nums,int target){

        if(target>nums[nums.length-1]){
            return -1;
        }
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]<target){
                start = middle+1;
            } else if (nums[middle]>target) {
                end = middle -1;
            }
            else {
                return middle;
            }

        }
        return nums[start];
    }

}
