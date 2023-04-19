package Basic.ConditionsLoops;

import java.util.Scanner;

public class Largest {


    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 20;
        int num3 = 30;

       int max=num1;
       if(num2>max){
            max=num2;
       }
        if(num3>max){
            max=num3;
        }
        System.out.println("Maximum number is: "+max);
    }
}
