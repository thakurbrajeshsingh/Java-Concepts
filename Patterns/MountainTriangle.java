package Patterns;

public class MountainTriangle {
    public static void main(String[] args) {
        triangle(5);


    }

    static void triangle(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsInRow = row > n ? 2 * n - row : row;
            for (int cols = 0; cols < totalcolsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
