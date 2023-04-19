package ExceptionHandling.VotingSystem;


import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}


public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        Vote(age);

        System.out.println("HELLO");
    }

    static void Vote(int age) {

        try {
            if (age < 18) {
                throw new YoungerAgeException("Your are Not Eligible To Vote");
            } else {
                System.out.println("You can Vote");
            }
        } catch (YoungerAgeException e) {
//            e.printStackTrace();
            System.out.println("Manual Exception :"+e);
        }
    }
}

