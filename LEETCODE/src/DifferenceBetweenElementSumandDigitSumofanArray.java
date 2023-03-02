public class DifferenceBetweenElementSumandDigitSumofanArray {
    //https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
    public static void main(String[] args) {
        int [] arr = {1,15,6,3};
        int esum =0;
        int dsum =0;
        for (int i = 0; i < arr.length; i++) {
            esum = esum + arr[i];
            if(arr[i]<=9){
                dsum = dsum + arr[i];
            }
            if(arr[i]>9){
                int temp =0;
                while(arr[i]>0){
                   int digits = arr[i]%10;
                   arr[i] = arr[i]/10;
                   temp = temp+digits;
                }
                dsum = dsum + temp;
            }

        }
        System.out.println(Math.abs(dsum-esum));
    }
}
