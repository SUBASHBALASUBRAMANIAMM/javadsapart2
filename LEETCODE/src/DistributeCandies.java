public class DistributeCandies {
    //https://leetcode.com/problems/distribute-candies/description/
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count =0;
        for(int i : candyType){
            min = Math.min(i,min);
            max = Math.max(i,max);
        }
//        System.out.println(min + " " + max);
        int arr[] =  new int[max-min +1];
        for(int k : candyType){
            int j = k - min;
            if(arr[j]==0){
                arr[j]++;
                count++;
            }
        }
        System.out.println(Math.min(candyType.length/2,count));
    }
}
