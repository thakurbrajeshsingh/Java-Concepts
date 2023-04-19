package Patterns;

public class NumericMountain {
    public static void main(String[] args) {
        numericMount(5);
    }


    static void numericMount(int n) {

        for (int row = 1; row <= n; row++) {


            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }

            for (int cols = row; cols >= 1; cols--) {
                System.out.print(cols);
            }
            for (int cols = 2; cols <= row; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }

    }
}
