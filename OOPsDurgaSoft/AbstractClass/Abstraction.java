package OOPsDurgaSoft.AbstractClass;

import javax.crypto.spec.PSource;

abstract class Vehicle {
    abstract int noOfWheels();
}

class Car extends Vehicle {
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle{
    @Override
    int noOfWheels() {
        return 2;
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Car c= new Car();
        System.out.println(c.noOfWheels());


        Bike b= new Bike();
        System.out.println(b.noOfWheels());
    }

}


