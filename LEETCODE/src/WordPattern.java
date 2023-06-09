import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
    //https://leetcode.com/problems/word-pattern/
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        String[] pat = s.split(" ");
        char[] str = pattern.toCharArray();
        System.out.println(Arrays.toString(pat));
        System.out.println(Arrays.toString(str));
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<str.length;i++){
            if(hm.containsKey(str[i])){
                if(hm.get(str[i]).equals(pat[i])==false){
                    System.out.println("false");
                    break;

                }
            }else if(hm.containsValue(pat[i])==false){
                hm.put(str[i],pat[i]);
            }else {
                System.out.println(false);
                break;

            }
        }
        System.out.println("true");
    }
}
