import java.util.Arrays;

public class MissingNumber {
    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0;
        for ( i = 0; i < arr.length; i++) {
            if(i!=arr[i]){
                System.out.println(i);
            }

        }
        System.out.println(i);
    }
    static void cyclic_sort(int arr[]){

        for(int i=0;i<arr.length;){
            if(i!=arr[i]&&arr[i]< arr.length){
                swap(arr,i,arr[i]);

            }
            else i++;
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
