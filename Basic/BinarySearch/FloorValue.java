package Basic.BinarySearch;

//find greatest element in array smaller or = target

public class FloorValue {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = FindFloor(arr,1);
        System.out.println(ans);
    }

    static int FindFloor(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
         int middle = start + (end-start)/2;
         if(target<nums[middle]){
             end = middle-1;
         } else if (target>nums[middle]) {
             start = middle+1;
         }else {
             return middle;
         }
        }
        return end;
    }



}
