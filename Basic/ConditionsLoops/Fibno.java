package Basic.ConditionsLoops;

import java.util.Scanner;

public class Fibno {
    public static void main(String[] args) {
        int p=0;
        int i=1;
        int count=2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter For Fibonacci Series: ");
        int n= sc.nextInt();
        while (count<=n){
           int temp=i;
           i=i+p;
           p=temp;
           count++;
        }
        System.out.println(i);
    }
}

