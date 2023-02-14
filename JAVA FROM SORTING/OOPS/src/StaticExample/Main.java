package StaticExample;

public class Main {
    public static void main(String[] args) {
        //greeting() -> this will give an error
        Example.obj.greeting();
    }


}
 class Example{

     void greeting(){
        System.out.println("hello world");
    }

    public static final Example obj=null;
}
