import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','c','d','d'};
        int count =0;
        int unique =0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if(i+1==chars.length||chars[i]!=chars[i+1]){
                chars[unique]=chars[i];
                unique = unique+1;

                if(count !=1){
                    String c= Integer.toString(count);
                    System.out.println(c);
                    char[] ch = c.toCharArray();
                    for(int j =0; j<ch.length;j++){
                        chars[unique]=ch[j];
                        unique = unique+1;
                    }

                }
                count =0;
            }

        }
        System.out.println(Arrays.toString(chars));
        System.out.println(unique);
    }
}
