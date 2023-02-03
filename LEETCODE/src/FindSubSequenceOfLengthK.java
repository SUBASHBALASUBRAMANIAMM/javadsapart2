import java.util.Arrays;

public class FindSubSequenceOfLengthK {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        int res[] = arr.clone();
//        for(int i=0;i<arr.length;i++){
//            res[i] = arr[i];
//        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));

    }
}
