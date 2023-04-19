package OOPsDurgaSoft.Abstraction;

// abstract class
abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // abstract method
    public abstract void start();

    // concrete method
    public void stop() {
        System.out.println("Stopping the " + brand);
    }
}

// concrete class
class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + brand);
    }
    
}

// main method
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2020);
        car.start();
        car.stop();
    }
}
