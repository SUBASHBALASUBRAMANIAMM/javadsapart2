package Interfaces;

public class Car implements Engine,Brake,Media {

    @Override
    public void brake() {
        System.out.println("Normal car brake applied");
    }

    @Override
    public void start() {
        System.out.println("normal engine started");
    }

    @Override
    public void stop() {
        System.out.println("nornal engine stoped");
    }

    @Override
    public void acc() {
        System.out.println("normal engine acc");
    }
}
