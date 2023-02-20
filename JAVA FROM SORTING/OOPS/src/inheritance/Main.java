package inheritance;

public class Main {
    public static void main(String[] args) {
        //Box box = new Box();
       // Box box = new Box(4);
       // Box box = new Box(4,6.2,7.7);
        Box box1 = new Box(4,6.2,7.7);
        Box box2 = new Box(box1);
        System.out.println("l = "+box2.length+" h= "+box2.height+" w = "+box2.width);
    }

}
