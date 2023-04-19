package Basic.Switch;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fruit Name: ");
    String fruits=sc.next();
        switch (fruits) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Sweet Red Fruit");
            case "Grapes" -> System.out.println("Sweet Fruits");
            default -> System.out.println("Fruits Fruits!!!");
        }



    }
}
