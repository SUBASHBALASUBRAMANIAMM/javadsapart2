import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        String[] word = {"cat","bt","hat","tree"};
        String chars = "atach";
            int i=0;

        for(int k = 0;k<word.length;k++){
            if(found(word[k],chars)){
                i= i + word[k].length();
                System.out.println(i);
            }}


    }

    public static boolean  found(String word,String chars){
        char[] word1=word.toCharArray();
        char[] chars1=chars.toCharArray();
        int count =0;

        for(int i=0;i<word1.length;i++){
            for(int j = 0;j<chars1.length;j++){
                if(word1[i]==chars1[j]){
                    chars1[j]=0;
                   // System.out.println(Arrays.toString(chars1));
                    count++;
                    break;
                }
            }
        }
        if(count==word.length()){

            return true;}
       // System.out.println(count);
       return false;

    }
}