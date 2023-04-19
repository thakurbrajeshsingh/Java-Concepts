package Patterns;

public class Diamond {
    public static void main(String[] args) {
        diamond(5);
    }


    static void diamond(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int totalColsInRow = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalColsInRow;
            for (int i = 0; i < totalSpaces; i++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
