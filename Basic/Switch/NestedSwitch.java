package Basic.Switch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your EmpId: ");
        int empId = sc.nextInt();
        String department = sc.next();

        switch (empId){
            case 1:
                System.out.println("Brajesh");
                break;
            case 2:
                System.out.println("Sookia");
                break;
            case 3:
                System.out.println("Emp No 3");
               switch (department){
                   case "IT":
                       System.out.println("IT Department");
                       break;
                   case "Management":
                       System.out.println("Management Department");
                       break;
                   case "Support":
                       System.out.println("Support Department");
                       break;
                   default:
                       System.out.println("No Department");

               }
               break;
            default:
                System.out.println("Not A valid EmpId");

        }
    }
}
