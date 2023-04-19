package Basic.BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
//    int[] arr= {7,2,5,10,8};
//    System.out.println(spiltArray(arr,2));

        float f=9.0f;
        System.out.println(f/(float)3 );

    }

    static int spiltArray(int[] arr,int m){
        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
        start=Math.max(start,arr[i]);     //return max Element of array
        end +=arr[i];
        }
        while(start<end){
            int middle=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int i:arr) {
                if(sum+i>middle){
//                    your cannot element to this array
                    sum=i;
                    pieces++;
                }else {
                    sum+=i;
                }
            }
            if(pieces>m){
                start=middle+1;
            }else {
                end=middle;
            }

        }
        return end; //here end== start
        }



}
