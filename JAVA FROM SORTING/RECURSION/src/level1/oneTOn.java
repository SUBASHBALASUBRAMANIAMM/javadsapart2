package level1;

public class oneTOn {
    public static void main(String[] args) {

        funBoth(5);
    }
    static void fun(int n){
        if(n<=1){
            System.out.println(1);
            return ;
        }

        fun(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n<=1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
