package Oops.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts like Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops like Power Engine");
    }
}
