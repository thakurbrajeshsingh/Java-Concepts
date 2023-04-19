package OOPsPractice;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int age1 = sc.nextInt();
        String gender1 = sc.next();

        String name2 = sc.next();
        int age2 = sc.nextInt();
        String gender2 = sc.next();

        if (name1.equals(name2) && age1==age2 && gender1.equals(gender2)) {
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }





    }
}
