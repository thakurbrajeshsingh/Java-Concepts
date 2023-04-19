package Basic.Searching;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr ={3,7,1,2,82,77,5,3,0,2,88};
        System.out.println(searchRange(arr,2,6,77));

    }
    static int searchRange(int[] arr,int start,int end,int target){
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}
