package Oops.Interfaces;

public class NiceCar {

    private  Media player=new CDplayer();
    private Engine engine;

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }


    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }


    public void UpgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
