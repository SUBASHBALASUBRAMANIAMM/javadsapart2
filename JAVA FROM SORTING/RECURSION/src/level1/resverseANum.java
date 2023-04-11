package level1;

public class resverseANum {
    static int sum =0;
    static void reverse1(int n){
        if(n==0){
            return;
        }
        sum = sum*10+ n%10;
        reverse1(n/10) ;

    }
    static int reverse2(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {

        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1 ) + helper(n/10,digits-1);
    }

    public static void main(String[] args) {
        System.out.println(reverse2(1234));

    }

}
