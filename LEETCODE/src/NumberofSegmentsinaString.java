public class NumberofSegmentsinaString {
    //https://leetcode.com/problems/number-of-segments-in-a-string/description/
    public static void main(String[] args) {
        int count =0;
        String s = "             Hello, my name is John        hj   ";
      String trimmed = s.trim();
        System.out.println(trimmed);
        System.out.println(trimmed.split("\\s+"));
    }
}
