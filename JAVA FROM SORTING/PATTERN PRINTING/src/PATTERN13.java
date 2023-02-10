public class PATTERN13 {
    public static void main(String[] args) {
        int n =5;
        for (int row = 0; row < n; row++) {
            for(int k =0;k<n-row-1;k++){
                System.out.print(" ");
            }
            if(row!=n-1){
            for(int col =0;col<2*row+1;col++){
                if(col==0||col==2*row){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }}
            else {
                for(int col =0;col<2*row+1;col++){
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
