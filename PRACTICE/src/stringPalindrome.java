import java.sql.SQLOutput;
import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        int start = 0;
        int end = inp.length()-1;


        while (start<end) {
            if (inp.charAt(start) == inp.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.println("not a palindrome");
                break;
            }
        }
        if(end<=start)
        System.out.println("palindrome");
        //System.out.printf("%d %d",start,end);
    }
}
