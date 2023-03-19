package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine has started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine has STOPPED");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine has ACC");
    }
}
