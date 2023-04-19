package OOPsPractice;


import java.util.Arrays;
import java.util.Scanner;

class Voter {

    static void checkEligibility(int age) {
        if (age > 18) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Your can vote after " + (18 - age) + " year");
        }
    }

    @Override
    public String toString() {
        return "hello";
    }
}


public class Source {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Voter v1 = new Voter();
        v1.checkEligibility(age);


//        String nameId = "Brajesh 101";
//        String[] name = nameId.split(" ");
//        int id = Integer.parseInt(name[1]);
//        System.out.println(id);
//        System.out.println(name[0]);



    }
}
