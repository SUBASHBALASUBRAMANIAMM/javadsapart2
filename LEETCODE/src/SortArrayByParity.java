import java.util.Arrays;

public class SortArrayByParity {
    //https://leetcode.com/problems/sort-array-by-parity/description/
    public static void main(String[] args) {
        int arr[] =  {3,1,2,4};
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[right]%2==0){
                swap(left,right,arr);
                left++;
            }else{
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int left,int right,int[] arr){
        int temp = arr[left];
        arr[left]= arr[right];
        arr[right] = temp;

    }

}
