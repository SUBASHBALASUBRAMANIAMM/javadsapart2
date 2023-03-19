package Abstract;

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }


    abstract void career();
    abstract void school();

    void normal(){
        System.out.println("this is normal method");
    }
}
