package Basic.Searching;

public class Basic {
    public static void main(String[] args) {

        int[] arr = {2,7,1,9,1,12,71};
        System.out.println(LinearSearch(arr,71));
    }
    static int LinearSearch(int[] arr,int target){

       if(arr.length==0){
           return -1;
       }

        for(int i=0;i< arr.length;i++){
            if(arr[i]==target) {
                return i+1;
            }
        }
        return -1;
    }
}
