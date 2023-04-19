package Basic.Searching;

public class CountEvenDigits {
    public static void main(String[] args) {

        int[] nums = {1,23,8573,2775};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums){
        int count=0;
        for(int num:nums){
           if(even(num)){
               count++;
           }
        }
        return count;
    }

    static boolean even(int num) {
    int numberOfDigit = countDigits(num);
    if(numberOfDigit%2==0){
        return true;
        }
    return false;
    }

    static  int countDigits(int num){
        int count=0;
       while(num>0){
           count++;
           num=num/10;
       }
       return count;
    }

}
