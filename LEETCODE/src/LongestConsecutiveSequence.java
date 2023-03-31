import java.util.HashMap;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    //https://leetcode.com/problems/longest-consecutive-sequence/description/
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        System.out.println(hm);

    }
}
