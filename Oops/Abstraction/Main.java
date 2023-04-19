package Oops.Abstraction;

public class Main {


    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();


        son.carreer();
        son.partner();

        daughter.carreer();
        daughter.partner();

        daughter.normal();


    }
}
