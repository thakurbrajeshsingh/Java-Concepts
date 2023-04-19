package Patterns;

public class NumericRightAngleTriangle {

    public static void main(String[] args) {
        rigthAngle(5);
    }
    static void rigthAngle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
