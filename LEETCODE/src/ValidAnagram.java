public class ValidAnagram {
    public static void main(String[] args) {
        int[] arr = new int[27];
        String s = "rat";
        String t = "car";

        if(s.length()!=t.length()){
            System.out.println("false");
        }
        for(int i =0; i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i =0; i<t.length();i++){
            arr[t.charAt(i) - 'a']--;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
