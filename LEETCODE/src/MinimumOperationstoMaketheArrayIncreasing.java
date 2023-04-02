public class MinimumOperationstoMaketheArrayIncreasing {
    //https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/description/
    public static void main(String[] args) {
        int[] arr = {1,1,1};//121
        int min =0;
        int diff =0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]){
                diff = arr[i] -arr[i+1] +1;
                min = min + diff;
                arr[i+1] = arr[i+1] + diff;

            }
        }

        System.out.println(min);
    }
}
