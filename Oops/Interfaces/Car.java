package Oops.Interfaces;

public class Car implements Engine, Brakes, Media {


  int a=30;

    @Override
    public void brakes() {
      System.out.println("I Brake Like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void stop() {
      System.out.println("I stop engine like a normal car");
    }

  @Override
  public void accelerate() {
    System.out.println("I accelerate like a normal car");
  }
}
