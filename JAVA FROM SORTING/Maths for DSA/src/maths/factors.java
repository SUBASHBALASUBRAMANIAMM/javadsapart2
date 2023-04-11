package maths;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors3(20);
    }
    static void factors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    static void factors2(int n){
        for(int i=1;i<= Math.sqrt(n);i++){

            if(n%i==0){
                if(n/i==i) System.out.println(i);
                else
                System.out.print(i + " " + n/i + " ");
            }
        }
    }
    static void factors3(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<= Math.sqrt(n);i++){

            if(n%i==0){
                if(n/i==i) System.out.print(i + " ");
                else
                    System.out.print(i + " ") ;
                al.add(n/i);
            }
        }
        for (int i = al.size()-1; i >=0 ; i--) {
            System.out.print(al.get(i) + " ");
        }
    }

}
