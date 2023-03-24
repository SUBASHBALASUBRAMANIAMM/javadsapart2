import java.util.Arrays;

public class TwoSumII {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/solutions/?orderBy=most_votes
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        int[] ind = new int[2];



        int left =0;
        int right = num.length -1;
        while(left<right){
            if(num[left] + num[right] == target){
                ind[0] = left+1;
                ind[1] = right+1;
                break;
            }else if(num[left] + num[right] > target){
                right--;
            }else left++;
        }
        System.out.println(Arrays.toString(ind));
    }
}
