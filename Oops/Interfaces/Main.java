package Oops.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();

//        Engine car decides what things to access
//        new car which version to access depends upon this
//        System.out.println(car.a);


//        Media musicPlayer = new Car();
//        musicPlayer.stop();
//
//        CDplayer mplay=new CDplayer();
//        mplay.stop();



        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.startMusic();
        niceCar.stopMusic();




    }


}
