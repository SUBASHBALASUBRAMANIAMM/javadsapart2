public class exceptionHandling {
    public static void main(String[] args) {
        int num =8;

        try{
            int ans = num/2;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println("Exception");
        }catch (Exception e){
            System.out.println("AE");
        }finally {
            System.out.println("final");
        }
    }
}
