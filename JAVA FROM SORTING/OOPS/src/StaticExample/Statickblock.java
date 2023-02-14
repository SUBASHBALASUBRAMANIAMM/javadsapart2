package StaticExample;

public class Statickblock {
    static int a =5;
    static int b;
    static{
        System.out.println("inside static block");
        b = 4*a;
    }
    public static void main(String[] args) {
        System.out.println("a " + a);
        System.out.println("b "+ b);


    }
}
