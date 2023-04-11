package level1;

public class productOfDigits {
    public static void main(String[] args) {
        System.out.println(prod(10));
    }
    static int prod(int n){
//        if(n==0){
//            return 1;
//        }
        if(n%10==n){
            return n;
        }
        return n%10 * prod(n/10);
    }
}
