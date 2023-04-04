public class OptimalPartitionofString {
    //https://leetcode.com/problems/optimal-partition-of-string/
    public static void main(String[] args) {
        String s = "ssssss";
        int[] arr = new int[26];
        int val=0;
        int count=1;
        for(int i =0 ;i<s.length();i++){
            val = s.charAt(i) - 'a';
            if(arr[val]==0){
                arr[val]++;
            }else{
                count++;
                i--;
                arr = new int[27];
            }
        }
        System.out.println(count);
    }
}
