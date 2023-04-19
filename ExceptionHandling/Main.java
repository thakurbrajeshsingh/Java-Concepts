package ExceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            System.out.println("Before Exception");
            int c = a / b;
            System.out.println("After Exception");
        } catch (Exception e) {
            System.out.println("manual exception " + e);
            System.out.println("Catch Block ");
        } finally {
            System.out.println("Finally Block");
        }
    }
}
