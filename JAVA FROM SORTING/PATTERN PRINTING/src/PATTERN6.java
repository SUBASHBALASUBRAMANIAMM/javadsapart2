public class PATTERN6 {
    public static void main(String[] args) {
        int n =5;
        for(int row =0;row<n;row++){
            for(int gap = 0;gap <n-1-row;gap++){
                System.out.print(" ");
            }
            for(int star = 0;star < row+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
