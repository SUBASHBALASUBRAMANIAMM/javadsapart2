public class PATTERN8 {
    public static void main(String[] args) {
        int n = 5;
        int count =0;

        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n-(row+1); space++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row+count ; col++) {
                System.out.print("*");

            }
            count++;
            System.out.println();
        }
    }
}
