import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int count[] = new int[1000];
        int[] ans = new int[arr1.length];
        for(int i =0;i<arr1.length;i++){
            count[arr1[i]]++;
        }
//        System.out.println(Arrays.toString(count));
        int k =0;
        for (int j = 0; j < arr2.length; j++) {
            int c  = count[arr2[j]];
            for(int s =0;s<c;s++){
                ans[k++] = arr2[j];
                count[arr2[j]]--;
            }

        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0){
                for(int j =0;j<count[i];j++){
                    ans[k++] = i;
                }
            }

        }
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(ans));
    }
}
