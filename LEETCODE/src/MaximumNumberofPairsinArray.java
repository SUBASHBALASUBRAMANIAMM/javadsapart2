import java.util.Arrays;

public class MaximumNumberofPairsinArray {
    //https://leetcode.com/problems/maximum-number-of-pairs-in-array/
    public static void main(String[] args) {
        int [] nums = {1, 3, 2, 1, 3, 2, 2};
        int count=0;
        int replace =-1;
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    nums[j] = replace--;
                    break;
                }
            }
        }
        int[] arr = new int[2];
        arr[0]= count;
        arr[1] = nums.length - (count*2);
        System.out.println(Arrays.toString(arr));
    }
}
