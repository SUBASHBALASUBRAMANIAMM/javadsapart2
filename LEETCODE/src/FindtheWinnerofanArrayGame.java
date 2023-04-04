public class FindtheWinnerofanArrayGame {
    //https://leetcode.com/problems/find-the-winner-of-an-array-game/
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,7};
        int k =2;
        int cur_max = arr[0];
        int win=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>cur_max){
                cur_max= arr[i];
                win=0;
            }
            win++;
            if(win==k) break;
        }
        System.out.println(cur_max);
    }
}
