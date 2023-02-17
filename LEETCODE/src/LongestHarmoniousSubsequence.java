import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int n[] = {-1,-3,-1,-2,-2};
        int a=1;
        HashMap <Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            if (hm.containsKey(n[i])) {
                int o= hm.get(n[i]) + 1;
                hm.put(n[i],o);
            }
            else
                hm.put(n[i], a);
        }

        System.out.println(hm);
        int max =0;
        Set<Integer> set = hm.keySet();
        for(int var:set){
            if(hm.containsKey(var+1)){
                max = Math.max(max,hm.get(var) + hm.get(var+1));
            }
        }
        System.out.println(max);
    }
}