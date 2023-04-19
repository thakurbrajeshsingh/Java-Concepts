package Recursion;

public class Main {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        print3(3);
        System.out.println(n);
    }

    static void print3(int n) {
        print4(4);
        System.out.println(n);
    }

    static void print4(int n) {
        print5(5);
        System.out.println(n);
    }

    static void print5(int n) {
        System.out.println(6);
    }


}
