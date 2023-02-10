public class PATTERN3 {
    public static void main(String[] args) {
        int num =5;
        for(int row = 5;row>0;row--){
            for (int col = row; col >0 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
