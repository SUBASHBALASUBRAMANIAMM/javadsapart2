import java.lang.reflect.Array;
import java.util.Arrays;

public class FindtheKthLargestIntegerintheArray {
    public static void main(String[] args) {
        String[] nums = {"2","21","12","1"};
        int k =4;

        String j = nums[1];
        char[] ch = j.toCharArray();
        int z = Character.valueOf(ch[0])-'0';
        System.out.println(z);
        System.out.println(Arrays.toString(nums));
        int count =0;
        for(int i = nums.length-1;i>=0;i--){
            count++;
            if(k==count){
                System.out.println(nums[i]);}
        }

    }
}
