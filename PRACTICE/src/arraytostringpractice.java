public class arraytostringpractice {
    public static void main(String[] args) {
        char[] ch = {'d','e','5','l'};
        char[] ch1 = {'p','w','z','e'};
        char[] arr = new char[ch.length+ ch1.length];
        int x =0;
        int y =0;
        for(int i =0;i<arr.length;){
            arr[i] = ch[x];
            arr[++i] = ch[y];
            x++;
            y++;
        }
        String str = new String(arr);
        System.out.println(ch);
    }
}
