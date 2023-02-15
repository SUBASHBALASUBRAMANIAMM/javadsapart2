package Singleton;

public class Singleton {
    private Singleton(){

    }
     private static Singleton instance;
    public static Singleton getSIngleton(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
