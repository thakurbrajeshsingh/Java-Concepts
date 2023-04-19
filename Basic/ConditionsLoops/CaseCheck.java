package Basic.ConditionsLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
//         a:97,z:122   A:65 Z:90
        System.out.print("Enter a Character: ");
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("LowerCase");
        }else {
            System.out.println("Uppercase");
        }






    }
}
