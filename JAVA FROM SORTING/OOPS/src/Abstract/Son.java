package Abstract;

public class  Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a coder");
    }

    @Override
    void school() {
        System.out.println("i will go to bit");
    }
}
