import java.util.*;
public class ReverseExceptSymbol {
    // talently question
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String inp = "";
        inp +=in.nextLine();
        in.close();


        char[] input = inp.toCharArray();
        int start=0;
        int end = inp.length()-1;
        while(start<end){
            int i = input[start];
            int j = input[end];
            if(((i>=65&& i <= 90 ) ||(i>=97&& i <= 172 ) ||(i>=48&& i <= 57 ) )&& ((j>=65&& j <= 90 ) ||(j>=97&& j <= 172 ) || (j>=48&& j <= 57 ))){
                char temp = input[end];
                input[end]=input[start];
                input[start]=temp;
                start++;
                end--;
            }
            if(i < 48 || i >57){
             if((i<65 || i>90 && i<97 ) || (i< 97 && i>90 || i>172) ) start++;}
            if(j < 48 || j >57){
            if((j<65 || j>90 && j<97 ) || (j< 97 && j>90 || j>172) ) end--;}
        }
        String string = new String(input);
        System.out.println(string);
    }
}
//    Sample Input 1:
//        Fiih+!\,ln
//
//
//        Sample Output 1:
//        nlhi+!\,iF
//
//
//        Sample Input 2:
//        A man, in the boat says : I see 1-2-3 in the sky
//
//
//        Sample Output 2:
//        y kse, ht ni3 21ee sIsy : a sta o-b-e ht nin amA

