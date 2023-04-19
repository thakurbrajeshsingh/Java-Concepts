package Basic.Function;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter A Number: ");
//        int n =sc.nextInt();
//        System.out.println(isArmStrom(n));

        for (int i=100;i<1000;i++){
            if (isArmStrom(i)){
                System.out.println(i);
            }

        }


    }


//36
    static boolean isArmStrom(int n){
        int original = n;
        int sum=0;
        while(0<n){
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        if(original==sum){
            return true;
        }
        return false;
    }
}
