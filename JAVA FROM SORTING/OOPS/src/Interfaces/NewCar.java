package Interfaces;

public class NewCar {
    private Engine engine;
    private Media musicplayer = new MusicPlayer();
    public NewCar(){
        this.engine = new PowerEngine();
    }
    public  NewCar(Engine engine){
        this.engine = engine;

    }

    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void startMusic(){
        musicplayer.start();
    }
    void stopMusic(){
        musicplayer.stop();
    }

    void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
