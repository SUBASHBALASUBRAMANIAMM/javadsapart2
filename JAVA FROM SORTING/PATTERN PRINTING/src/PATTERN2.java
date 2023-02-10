public class PATTERN2 {
    public static void main(String[] args) {
        int num = 4;
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*

 *
 * *
 * * *
 * * * *

 */