import java.util.Arrays;

class Test1 {
    protected String name = "Brajesh";

    protected void printName() {
        System.out.println("name is " + name);
    }
}

class Test2 extends Test1 {
    int age = 24;

    void printAge() {
        System.out.println("name is " + age);
    }
}

class Test {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.printName();
    }
}