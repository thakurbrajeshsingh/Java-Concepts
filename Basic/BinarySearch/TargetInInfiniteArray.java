package Basic.BinarySearch;

public class TargetInInfiniteArray {
    public static void main(String[] args) {
        int[] arr ={2,3,5,6,7,8,10,11,12,15,20,23,30};
        System.out.println(TargetInfiniteArray(arr,3));
    }

    static int TargetInfiniteArray(int[] nums,int target){
    int start=0;
    int end =1;
    while(nums[end]<target){
        int newStart = start;
        end = start +(end-start+1)*2;
        start=newStart;
        }
    return BinarySearch(nums,target,start,end);
    }

    static int BinarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            } else if (nums[mid]>target) {
                end = mid-1;
            }else {
                return mid;
            }
        }

        return -1;
    }

}
