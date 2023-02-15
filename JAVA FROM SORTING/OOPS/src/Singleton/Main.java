package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getSIngleton();
        Singleton obj1 = Singleton.getSIngleton();
        Singleton obj2 = Singleton.getSIngleton();
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
