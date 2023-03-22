package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try{
//            divide(5,0);
            String name = "subash";
            if(name.equals("subash"))
            throw new MyException("The name is subash");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception");
        }finally {
            System.out.println("this will always execute");
        }
    }
    static int divide(int a ,int b) throws ArithmeticException{
        if(b ==0){
            throw new ArrayIndexOutOfBoundsException("do not divide by 0");

        }
        return a/b;
    }
}
