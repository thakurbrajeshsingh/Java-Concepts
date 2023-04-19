package Basic.ConditionsLoops;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int sal=salary.nextInt();
        if(sal<=10000){
            sal+=1000;
        }else {
            sal+=2000;
        }
        System.out.println("Your Salary with Bonus: "+sal);
    }
}
