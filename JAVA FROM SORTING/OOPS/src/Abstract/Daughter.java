package Abstract;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("im going to be a doctor");
    }

    @Override
    void school() {
        System.out.println("i will go srm chennai");
    }
}
