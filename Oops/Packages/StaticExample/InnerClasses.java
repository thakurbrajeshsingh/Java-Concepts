package Oops.Packages.StaticExample;

public class InnerClasses {
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Brajesh");
        Test b = new Test("Ram");
        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
