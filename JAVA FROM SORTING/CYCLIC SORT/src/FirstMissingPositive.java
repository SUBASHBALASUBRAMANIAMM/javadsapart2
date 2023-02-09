import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMissingPositive {
    //https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
        int arr[] = {1,2,0};
        cyclic_sort(arr);
        List<Integer> list = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        int i=0;
        for ( i = 0; i < arr.length; i++) {
            if(i!=arr[i]-1){
                System.out.println(i+1);
            }

        }
    }
    static void cyclic_sort(int[] arr){
        for (int i =0;i<arr.length;){
            int correct= arr[i]-1;
            if(arr[i]>0&&arr[i]!=arr[correct]){
                swap(arr,i,arr[i]-1);

            }else{
                i++;

            }
        }
        /*
        int i =0;
        while(i<arr.length){
        int correct = arr[i] -1;
        if(arr[i]!=arr[correct]){
        swap(arr,i,arr[i]-1);
        }else i++;
        }
         */

    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;

    }
}
