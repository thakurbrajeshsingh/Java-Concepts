package Basic.BinarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,4,3,2};
        System.out.println(PeakOfMountain(arr));
    }

    static int PeakOfMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int middle = start + (end-start)/2;
            if(arr[middle]>arr[middle+1]){
//                you are in decreasing Order
//                this may be ans but check at left
                end=middle;
            }
            else {
//                you are in ascending Order
                start = middle+1;
            }
        }
//              here start ==  end and pointing to largest number
        return start;
        }




}



