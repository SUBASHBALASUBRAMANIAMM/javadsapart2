package Polymorphism;

public class Circle extends  Shape{
    // this will run wje object of circle is created
    // hence it is overriding rhe parent method
    @Override// this is annotation it is used to check whether the function is overriding or not
    void area(){
        System.out.println("Area of circle is pi * r *r");
    }
}
