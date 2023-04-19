package Basic.ConditionsLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Operator : ");
        char op = sc.next().trim().charAt(0);
        int ans=0;
        while(true){
            if(op =='+' || op =='-' || op =='*' || op =='/' || op =='%') {
                System.out.print("Enter Number 1: ");
                int num1 = sc.nextInt();
                System.out.print("Enter Number 2: ");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 - num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op== 'X') {
                    break;
                }else {
                    System.out.println("Enter Valid operator");
                }
            System.out.println(ans);
            }

    }


}
