package maths;

public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }

    static boolean isPrime(int n){
//        if(n ==1)return true;
//        for(int i =2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
        int i=2;
        while(i*i <= n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
