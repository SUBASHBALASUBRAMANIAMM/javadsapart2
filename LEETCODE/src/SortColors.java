import java.util.Arrays;

public class SortColors {
    //https://leetcode.com/problems/sort-colors/description/
    public static void main(String[] args) {
        int[] nums ={2,0,2,1,1,0};
        int zeroindex = 0;
        int secondindex = nums.length-1;
        for(int i=0;i<=secondindex;){
            if(nums[i]==0){
                swap(nums,i,zeroindex);
                zeroindex++;
                i++;
            } else if (nums[i]==2) {
                swap(nums,i,secondindex);
                secondindex--;

            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
    static void swap(int[] nums,int num1,int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
