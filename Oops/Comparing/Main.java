package Oops.Comparing;

public class Main {

    public static void main(String[] args) {
        Student Brajesh = new Student(043,99.4f);
        Student Rohit = new Student(12,64.55f);


        if(Brajesh.compareTo(Rohit)< 0){
            System.out.println("Rohit has more marks");
        }else {
            System.out.println("Brajesh has more marks");
        }

    }


}
