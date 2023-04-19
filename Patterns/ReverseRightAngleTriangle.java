package Patterns;

public class ReverseRightAngleTriangle {
    public static void main(String[] args) {
        reverseTriangle(5);
    }

    static void reverseTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
