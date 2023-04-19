package Basic.BinarySearch;

//1095. Find in Mountain Array

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(finalAns(arr));

    }


    static int finalAns(int[] arr){
        int peak = peakInMountain(arr);
        int firstTry = orderAgnosticBS(arr,3,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr,3,peak+1,arr.length-1);

    }

    static int orderAgnosticBS(int[] arr,int target,int start,int end){
        while(start<end){
        int middle = start + (end-start)/2;
        if(arr[middle]<target){
        start=middle+1;
        } else if (arr[middle]>target) {
            end=middle-1;
        }else {
            return middle;
            }
        }
        return -1;
    }


    static int peakInMountain(int []arr){
        int start=0;
        int end =arr.length-1;
        while(start<end){
          int middle = start+(end-start)/2;
          if(arr[middle]<arr[middle+1]){
              start=middle+1;
          } else {
              end=middle;
          }
        }
        return start;
    }



}
