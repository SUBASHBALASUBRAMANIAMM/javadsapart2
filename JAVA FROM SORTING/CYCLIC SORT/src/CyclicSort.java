import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic_sort(int[] arr){
        for (int i =0;i<arr.length;){
            if(i!=arr[i]-1){
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