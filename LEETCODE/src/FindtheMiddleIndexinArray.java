public class FindtheMiddleIndexinArray {
    //https://leetcode.com/problems/find-the-middle-index-in-array/description/
    public static void main(String[] args) {
        int arr[] = {2,3,-1,8,4};
        int total = 0;
        for (int i=0;i< arr.length;i++){
            total = total+ arr[i];
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int left = sum - arr[i];
            int right = total -sum;
            if(left==right){
                System.out.println(i);
            }

        }
    }
}
