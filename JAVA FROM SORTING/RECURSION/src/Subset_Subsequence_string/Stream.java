package Subset_Subsequence_string;

public class Stream {
    public static void main(String[] args) {
        System.out.println(skipApple("bapplecava"));
            String s = "k";
            s.replace(".","[.]");
        System.out.println();
    }
    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }
    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0)+ skipApple(up.substring(1));
        }
    }
}
