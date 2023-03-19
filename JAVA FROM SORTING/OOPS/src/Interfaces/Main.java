package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        car.stop();
        NewCar car = new NewCar();
        car.start();
        car.stop();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
        car.stop();
    }
}
