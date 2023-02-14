package introduction;

public class Main {
    public static void main(String[] args) {
        A student = new A("subash");
        System.out.println(student.num);
        System.out.println(student.name);

    }
}
class A{
    final int num =10;
    String name;
    A(String name){
        this.name = name;
    }

}