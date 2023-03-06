public class KthMissingPositiveNumber {
    //https://leetcode.com/problems/kth-missing-positive-number/
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 2;
        int number =1;
        int missing =0;
        int i =0;
        while(i<arr.length && k>0){

            if(i<arr.length &&arr[i]!=number){
                missing = number;

                k--;

            }else{
                i++;
            }

            number++;

        }
//        return missing;
        System.out.println(missing);
    }
}
