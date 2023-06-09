package TrustRace;

public class balancingElement2 {
    public static void main(String[] args) {
        int[] nums = {5,5,2,5,8};
        System.out.println(waysToMakeFair2(nums));
    }
        public static int waysToMakeFair(int[] nums) {
            if (nums.length == 1) {
                return 1;
            }
            int[] rightSum = new int[nums.length + 2];
            rightSum[nums.length - 1] = nums[nums.length - 1];
            rightSum[nums.length - 2] = nums[nums.length - 2];
            for (int i = nums.length - 3; i >= 0; i--) {
                rightSum[i] = nums[i] + rightSum[i + 2];
            }
            // for (int i = 0; i < rightSum.length; i++) {
            //     System.out.println(rightSum[i]);
            // }
            int out = 0;
            int sum0 = 0;
            int sum1 = 0;
            for (int i = -2; i < nums.length - 2; i++) {
                if (sum0 + rightSum[i + 3] == sum1 + rightSum[i + 4]) {
                    out++;
                }
                int temp = sum0 + nums[i + 2];
                sum0 = sum1;
                sum1 = temp;
            }
            return out;
        }

    public static int waysToMakeFair2(int[] nums)
    {
        int righte=0, righto=0;
        int lefto = 0,  lefte=0;
        //pre-calculate sum of even/odd indexes towards right
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
                righte+=nums[i];
            else
                righto+=nums[i];
        }

        int ans =0;

        for(int i=0;i<nums.length;i++)
        {
            //simulate removal of the current index by  subtracting  its value form righte/righto

            if(i%2==0)
                righte-= nums[i];
            else
                righto-=nums[i];

            //check if after removal our condition stands or not
            if(lefte+righto == righte+lefto)
                ans++;

            //depending on the index  , add its value to lefte/lefto
            if(i%2==0)
                lefte+=nums[i];
            else
                lefto+=nums[i];
        }
        return ans;

    }
    }

