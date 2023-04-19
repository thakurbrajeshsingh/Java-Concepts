package Oops.ExceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
//           divide(a,b);
           String name="Brajesh";
            if (name.equals("Brajesh")) {
                throw new MyException("Name is Brajesh");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always execute");
        }

    }

    static void divide(int a,int b) throws  ArithmeticException{
        if(b==0){
            throw new ArithmeticException("B Cannot be Zero");
        }
    }

}
