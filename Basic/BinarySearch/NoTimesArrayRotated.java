package Basic.BinarySearch;

public class NoTimesArrayRotated {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(countPivot(arr));
    }


    static int countPivot(int[] arr){
        int pivots =pivot(arr);
        if(pivots==-1){
            return 0;
        }else {
            return pivots+1;
        }
    }



    static int pivot(int[] arr){
    int start=0;
    int end =arr.length-1;

    while(start<end){
    int middle = start+(end-start)/2;
    if(arr[middle]>arr[middle+1]){
        return middle;
    } else if (arr[middle]<arr[middle-1]) {
        return middle - 1;
    } else if (arr[middle]<=arr[start]) {
        end = middle-1;
    }else {
        start=middle+1;
     }
    }
        return -1;
    }

}
