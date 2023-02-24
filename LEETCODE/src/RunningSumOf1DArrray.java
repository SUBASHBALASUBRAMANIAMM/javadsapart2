import java.util.Arrays;

public class RunningSumOf1DArrray {
    //https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[] res = new int[nums.length];
        int sum =0;
        for(int var : nums){
            sum = sum +var;
        }
        for(int i = res.length-1;i>=0;i--){
            res[i] = sum;
            sum = sum - nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
