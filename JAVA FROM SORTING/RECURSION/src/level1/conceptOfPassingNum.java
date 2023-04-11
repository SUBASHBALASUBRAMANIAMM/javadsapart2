package level1;

public class conceptOfPassingNum {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);

        // it will always subtract the n after the completion of fun;
        // so always n will be passed to the fun so infinite recursion
    }
}
