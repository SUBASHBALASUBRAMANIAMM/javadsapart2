import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KdiffPairsinanArray {
    //https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5};
        int k = 1;
        int count =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);
        for(int x : hm.keySet()){
            if(k>0 && hm.containsKey(x+k)){
                count++;
            }
            if(k==0 && hm.get(x)>1){
                count++;
            }
        }
        System.out.println(count);
    }
}
