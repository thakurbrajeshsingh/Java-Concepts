package Basic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {

    public static int funcAdd(int num) {
        return num + 1;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//       for(int i=0;i<arr.length;i++) {
//           System.out.print(arr[i] + " ");
//       }
//        System.out.println(Arrays.toString(arr));
        int num = 5;
        int ans = funcAdd(num);
        System.out.println(ans);
        System.out.println("value is " + num);
    }
}
