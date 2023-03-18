import java.util.Arrays;

public class KokoEatingBananas {
    //https://leetcode.com/problems/koko-eating-bananas/
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h =18;
        Arrays.sort(piles);
        int max = piles[piles.length-1];
        int res = max;
        int r =max;
        int l = 0;

        while(l <= r){
            int  k = l+(r-l)/2;
            int totalhours =0;
            for(int i : piles){
                totalhours =(totalhours + (int)  Math.ceil((double)i/k));

            }
//            System.out.println(totalhours);
            if(totalhours <= h){
                res = k;
                r = k-1;
            }else{
                l = k+1;
            }
        }
//        return res;
        System.out.println(res);

    }
}
