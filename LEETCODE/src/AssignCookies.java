public class AssignCookies {
    //https://leetcode.com/problems/assign-cookies/
    public static void main(String[] args) {
            int g[] = {1,2};
            int s[] = {1,2,3};
            int count =0;
            for(int i=0;i<g.length;i++){
                for(int j=0;j<s.length;j++){
                    if(g[i] <= s[j]){
                        count++;
                        s[j] = -1;
                        break;
                    }
                }
            }
        System.out.println(count);
    }
}
