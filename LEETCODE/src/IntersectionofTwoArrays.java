import java.util.Arrays;


public class IntersectionofTwoArrays {
    //https://leetcode.com/problems/intersection-of-two-arrays/
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res= new int[10];
        int k =0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res[k]= nums1[i];
                    k++;
                    nums1[i]=0;
                    nums2[j]=0;
                    break;
                }
            }


        }
        for(int i=0;i!=0;i++){

        }
        System.out.println(Arrays.toString(res));


    }

}
