import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNumberofOccurrences {
    //https://leetcode.com/problems/unique-number-of-occurrences/description/
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};// 1,1,1,2,2,3
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        int count =1;
        for(int i =1;i<arr.length;i++){

                if( arr[i]==arr[i-1]){
                    count++;
                }
                else
                {
                    if(al.contains(count)){
                        System.out.println("false");
                    }else{
                        al.add(count);
                        count =1;                    }
                }
        }
        if(al.contains(count)) System.out.println("false");

        System.out.println("True");
    }
}
