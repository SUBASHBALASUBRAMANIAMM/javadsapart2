public class leetcode2270 {
//    https://leetcode.com/problems/number-of-ways-to-split-array/
public static void main(String[] args) {
    int [] arr = {2,3,1,0};
    int sum =0;
    for (int j : arr) {
        sum = sum + j;
    }
    int count =0;
    int leftSum =0;
    for(int i=0;i<arr.length-1;i++){
        leftSum += arr[i] ;
        if (leftSum >= sum-leftSum){
            count++;
        }
    }
    System.out.println(count);
}
}
