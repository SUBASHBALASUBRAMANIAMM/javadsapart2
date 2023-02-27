public class MaximumAscendingSubarraySum {
    //https://leetcode.com/problems/maximum-ascending-subarray-sum
    public static void main(String[] args) {
        int[] nums = {12,17,15,13,10,11,12};
        int max =0;
        int temp =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                temp = temp +nums[i];
            }
            else if (i == nums.length-1){
                max = Math.max(temp,max);
                temp =0;
            }
            else{
                max = Math.max(temp,max);
                temp =0;
            }
        }
        System.out.println(max);
    }
}
