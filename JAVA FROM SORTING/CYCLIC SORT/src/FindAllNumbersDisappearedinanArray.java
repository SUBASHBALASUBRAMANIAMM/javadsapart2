import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        cyclic_sort(arr);
        List<Integer> list = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        int i=0;
        for ( i = 0; i < arr.length; i++) {
            if(i!=arr[i]-1){
                list.add(i);
            }

        }
    }
    static void cyclic_sort(int[] arr){
        for (int i =0;i<arr.length;){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
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

