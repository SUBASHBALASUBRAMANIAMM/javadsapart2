import java.util.Arrays;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        int[] arr1 = new int[100];
        for(int i =0;i<arr.length;i++){
            arr1[arr[i]] +=1;
        }
        Arrays.sort(arr1);
        int ans= arr1[arr1.length-1] + arr1[arr1.length-2];
        System.out.println(ans);

    }
}
