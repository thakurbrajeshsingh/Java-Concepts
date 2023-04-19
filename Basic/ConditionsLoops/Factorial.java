package Basic.ConditionsLoops;

import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Factorial: ");
        int n=sc.nextInt();
//        int r=1;
//        while(n>0){
//            r=r*n;
//            n--;
//        }
//        System.out.println("Factorial is: "+r);

        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("Factorial: "+fact);


    }
}
