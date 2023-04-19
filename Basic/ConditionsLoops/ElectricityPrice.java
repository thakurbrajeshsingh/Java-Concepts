package Basic.ConditionsLoops;

import java.util.Scanner;

public class ElectricityPrice {
    public static void main(String[] args) {
//        Cost Per Hour = kWh x Unit Price

        int Bill=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kWh: ");
        int kWh = sc.nextInt();
        System.out.print("Enter unit Price: ");
        int price = sc.nextInt();
        Bill=kWh*price;
        System.out.println("Your Bill is:Rs. "+Bill);


    }
}
