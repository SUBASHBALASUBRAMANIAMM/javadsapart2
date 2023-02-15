
import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/START77D/problems/JERRYCHASE
    /* Name of the class has to be "Main" only if the class is public. */
    public class TomandJerry {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t>0){
                int jerry = in.nextInt();
                int tom = in.nextInt();
                if(jerry<tom){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                t--;
            }

        }
    }


