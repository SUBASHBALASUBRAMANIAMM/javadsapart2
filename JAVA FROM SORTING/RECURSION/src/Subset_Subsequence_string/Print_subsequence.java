package Subset_Subsequence_string;

public class Print_subsequence {
    public static void main(String[] args) {
            print("","abcde");
    }
    public static void  print(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        print(p+ch,up.substring(1));
        print(p,up.substring(1));
    }
}
