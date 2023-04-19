package Basic.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                list.add(i);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to find value: ");
        int n = sc.nextInt();
        System.out.println("Array at index: " + list.get(n));
        System.out.println(list);
    }
}
