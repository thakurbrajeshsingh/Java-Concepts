package Basic.BinarySearch;

public class SmallestLetter {

//    LeetCode smallest Letter 744
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public static void main(String[] args) {

    char[] arr = {'A','B','D','F'};
    char ans = FindSmallestChar(arr,'C');
    System.out.println(ans);
}
static char FindSmallestChar(char[] arr,char target){
    int start=0;
    int end = arr.length-1;
    while(start<=end){
        int middle = start + (end-start)/2;
        if(target<arr[middle]){
            end = middle-1;
        }else {
            start = middle+1;
        }
    }
    return arr[start % arr.length];

}

}
