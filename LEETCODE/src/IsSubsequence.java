import java.util.Arrays;
import java.util.HashMap;

public class IsSubsequence {
    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";
        int si =0;
        if(s.length()==0) System.out.println("false");
        for(int i = 0;i<t.length();i++){
            if(s.charAt(si)==t.charAt(i)){
                si++;
            }
        }
        if (si == s.length()) System.out.println("true");
        else System.out.println("false");;
    }
}
