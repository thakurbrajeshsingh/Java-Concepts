package Patterns;

public class Rectangle {
    public static void main(String[] args) {
        rectangleTower(8);

    }


    static void rectangleTower(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
