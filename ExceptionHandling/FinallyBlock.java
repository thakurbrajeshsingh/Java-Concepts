package ExceptionHandling;

public class FinallyBlock {


    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 5;
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Manual Exception " + e);
            System.out.println("Exception Block");
        } finally {
            System.out.println("Finally Block");
        }

    }

}
