import java.util.Arrays;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        char[] ch = new char[inp.length()];
        char[] ch2 = new char[inp.length()];
        for(int i =0;i<inp.length();i++){
            ch[i]=inp.charAt(i);
        }
        int cntr =0;
        for(int i= (inp.length())/2;i<inp.length();i++){
            ch2[cntr]=ch[i];
            cntr++;
        }
        for(int i=0;i<(inp.length()/2);i++){
            ch2[cntr]=ch[i];
            cntr++;
        }
        System.out.println(Arrays.toString(ch2));
        for(int i =0;i<inp.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch2[j]);
            }
            System.out.println();
        }
    }
}