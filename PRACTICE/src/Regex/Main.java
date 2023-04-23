package Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String s = "Tamil abTamil Tamilan 5+94 ";
//        Pattern p = Pattern.compile("\\bTamil\\b");
//        Matcher m = p.matcher(s);
//        while (m.find()){
//            System.out.println(m.group());
//        }
        String ip = "HI";
//        String[] n = ip.split("[. ]");
//        System.out.println(Arrays.toString(n));
        String l = ip.toLowerCase();
        System.out.println(l);
        String a = new StringBuilder(l).reverse().toString();
        System.out.println(a);


    }
}
