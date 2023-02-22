package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shape box = new Shape();
//        Circle circle = new Circle();
//        Square square = new Square();
//        box.area();
//        circle.area();
//        square.area();

        Shape type = new Circle();
        type.area(); // -> circle area will be called
//        String k = type.toString();
//        System.out.println(k);.

        //static method cannot be overriden as overriden is depends on object but static doesnt
        // statuc method can be inherited but not overriden
    }
}
