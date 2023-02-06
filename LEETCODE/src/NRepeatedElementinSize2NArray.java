import java.util.Arrays;

public class NRepeatedElementinSize2NArray {
    public static void main(String[] args) {
        int [] nums = {5,1,5,2,5,3,5,4};
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) System.out.println(nums[i]);
        }
    }

}
