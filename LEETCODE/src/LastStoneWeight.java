import java.util.Arrays;

public class LastStoneWeight {
    //  https://leetcode.com/problems/last-stone-weight/
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i =arr.length-1;i>0;i--){
            arr[i-1] = arr[i]-arr[i-1];
            Arrays.sort(arr);
        }
        System.out.println(Arrays.toString(arr));

    }
}
