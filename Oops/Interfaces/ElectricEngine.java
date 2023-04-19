package Oops.Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Start like Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops Like Electric Engine");
    }
}
