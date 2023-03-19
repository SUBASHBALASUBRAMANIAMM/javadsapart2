package Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine has started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine has stopped");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine has acc");
    }
}
