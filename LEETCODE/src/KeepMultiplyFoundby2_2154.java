import java.util.Arrays;

public class KeepMultiplyFoundby2_2154 {
    //https://leetcode.com/problems/keep-multiplying-found-values-by-two/
    public static void main(String[] args) {
        int nums[]={5,3,6,1,12};
        int original = 3;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]==original){
                original = original*2;
            }
        }
        System.out.println(original);
    }
}
