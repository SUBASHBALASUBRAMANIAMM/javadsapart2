package maths;

import java.util.Arrays;

public class Seive {
    public static void main(String[] args) {
        int n =37;
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        seive(n,primes);

    }
    static void seive(int n,boolean[] primes){
        for(int i=2; i*i<=n ;i++){
            if(primes[i]){
                for(int j = i*2;j<=n;j=j+i){
                    primes[j]=false;
                }
            }
        }
        for(int i =2;i<=n;i++){
            if (primes[i])
            System.out.print(i + " ");
        }
    }
}
