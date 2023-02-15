
    /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/START77D/problems/TEKKEN

    /* Name of the class has to be "Main" only if the class is public. */
    public class Tekken {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);
            int t =in.nextInt();
            while(t>0){
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                if(b>c){
                    b = b-c;
                    c = c-c;
                }else{
                    c = c-b;
                    b = b-b;
                }
                if(a>b&&a>c){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

                t--;
            }

        }
    }


