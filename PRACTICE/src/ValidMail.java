import java.util.Scanner;
public class ValidMail {


        public static void main(String []args){
            Scanner in = new Scanner(System.in);
            String inp = in.next();
            int i;
            int flag =0;
            for( i=0;i<inp.length();i++){
                if(inp.charAt(i)=='@'&&inp.charAt(i+1)=='g'&&inp.charAt(i+2)=='m'&&inp.charAt(i+3)=='a'&&inp.charAt(i+4)=='i'&&inp.charAt(i+5)=='l'&&inp.charAt(i+6)=='.'&&inp.charAt(i+7)=='c'&&inp.charAt(i+8)=='o'&&inp.charAt(i+9)=='m'){
                    flag =1;
                    break;
                }
            }
            if(flag ==0) System.out.println("Invalid");
            else System.out.println("Valid");
        }
    }
//    Sample Input 1:
//        asgagdh.564@gmail.com
//
//Sample Output 1:
//        Valid
//
//
//        Sample Input 2:
//        yahoo.gmail.com
//
//
//        Sample Output 2:
//        Invalid
//

