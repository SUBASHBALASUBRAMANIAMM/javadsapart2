import java.util.Arrays;

public class numberofDistinctAverage {
    //https://leetcode.com/problems/number-of-distinct-averages/
    public static void main(String[] args) {
        int arr[] = {15,77,97,26,53,41,26,13,12,18,17,42,13,33,34,70,48,65,62,78,33,60,96,53,23,14,60,70,57,41,29,12,79,65,52,30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        float res[] = new float[arr.length/2];
        float sum =0;
        int start =0;
        int end = arr.length-1;
        int ind =0;
        while(start<end){
            sum = (float)(arr[start] + arr[end]);
            System.out.println(sum);
            res[ind]=sum;
            start++;
            end--;
            ind++;

        }
        System.out.println(Arrays.toString(res));
        Arrays.sort(res);
        int count =0;
        for(int i=1;i<res.length;i++){
            if(res[i-1]!=res[i]){
                count++;
            }
        }
        System.out.println(count +1);

    }
}
