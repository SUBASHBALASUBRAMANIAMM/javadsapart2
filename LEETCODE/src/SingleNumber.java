import java.util.Arrays;

public class SingleNumber {
    //https://leetcode.com/problems/single-number/description/
    public static void main(String[] args) {
        int[] n = {4,1,2,1,2};
        int c=1;
        Arrays.sort(n);
        for(int i=1;i<n.length;i++){
            if(  n[i]==n[i-1]){
                c++;
            }
            else{
                if(c==1){
                    System.out.println(n[i-1]);}
                c =1;
            }
        }
        System.out.println( n[n.length-1]);
    }
}
