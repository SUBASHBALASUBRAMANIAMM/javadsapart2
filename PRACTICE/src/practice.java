import java.util.Arrays;
import java.util.Stack;

public class practice {
    public static void main(String args[]) {

        int[] arr = {5,-1,4,4,0,-4};
        int left =0;
        int right =0;
        int count =0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            left = left + arr[i];
            right = sum - left;

            if(left==right){
                count++;
            }

        }
        System.out.println(count);
        }

    }

