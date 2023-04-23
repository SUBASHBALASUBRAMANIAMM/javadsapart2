public class StringComparrison {
    public static void main(String[] args) {
        String s = "aaaabbcccdddeefj";
        StringBuilder ans = new StringBuilder();
        int count=0;
        int i =0;
        for ( i = 0; i < s.length()-1; i++) {
            count++;
            if(s.charAt(i)!=s.charAt(i+1)){
                ans.append(s.charAt(i));
                ans.append(count);
                count=0;
            }
        }
        ans.append(s.charAt(i));
        ans.append(count+1);
        System.out.println(ans);
    }
}
