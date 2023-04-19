package Basic.BinarySearch;

public class RotatedBFS {
    public static void main(String[] args) {

        int[] arr={11,12,15,2,5,6,8};
        System.out.println(search(arr,6));

    }


    static int search(int[] arr,int target){
        int pivot = pivot(arr);
        if(pivot==-1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        return BinarySearch(arr,target,pivot+1, arr.length-1);
    }

    static int BinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target<arr[middle]){
                end = middle-1;
            }else if(target>arr[middle]){
                start=middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(middle<end && arr[middle]>arr[middle+1]){
                return middle;
            }
            if (middle>start && arr[middle]<arr[middle-1]){
                return middle-1;
            }
            if (arr[middle]<=arr[start]){
                end = middle-1;
            }else {
                start = middle + 1;
            }
        }
        return -1;
    }

}
