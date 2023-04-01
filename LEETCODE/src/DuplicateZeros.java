import java.util.Arrays;

public class DuplicateZeros {
    static int s=0;
    //https://leetcode.com/problems/duplicate-zeros/description/
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                swap(i+1,arr);
                i = i+1;
            }
        }
    }
    //1,0,2,2,3,0,4,5
    static void swap(int i,int[] arr){

       int temp1 = arr[i];
       int temp2 = 0;
       arr[i] = 0;
        for (int j = i+1; j < arr.length; j++) {
                temp2 = arr[j];
                arr[j] = temp1;
                temp1 = temp2;
        }
        System.out.println(Arrays.toString(arr));


    }
}
