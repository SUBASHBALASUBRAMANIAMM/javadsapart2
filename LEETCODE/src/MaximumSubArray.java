public class MaximumSubArray {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max =nums[0];
        int sum =nums[0];
        for(int i =1;i<nums.length;i++){
            sum = Math.max(sum + nums[i],nums[i]);
            max = Math.max(sum,max);


        }
        System.out.println(max);
    }
}
