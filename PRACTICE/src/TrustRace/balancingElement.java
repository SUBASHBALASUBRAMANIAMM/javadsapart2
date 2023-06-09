package TrustRace;

public class balancingElement {
    public static void main(String[] args) {
        Integer[] nums1 = {2,1,6,4}, nums2 = {5,5,2,5,8};
        System.out.println(solve(nums1));
        System.out.println(solve(nums2));
    }

    private static int solve(Integer[] nums) {
        int sum = 0;
        for(int n : nums)
            sum += n;
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            int oddSum = 0, oddPos = 0;
            if((sum - nums[i])%2 > 0)
                continue;
            for(int j=0;j<nums.length;j++) {
                if(i == j) {
                    oddPos++;
                    continue;
                }
                if(j == 0 || j == oddPos) {
                    oddSum += nums[j];
                    oddPos += 2;
                }
            }
            if(sum - nums[i] == oddSum * 2)
                res++;
        }
        return res;
    }
}
