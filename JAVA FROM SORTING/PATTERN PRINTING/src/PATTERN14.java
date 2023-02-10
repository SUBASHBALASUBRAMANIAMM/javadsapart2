public class PATTERN14 {
    public static void main(String[] args) {
        int n = 10;

        for (int row = 1; row <=n; row++) {
            for (int k = 1; k <row; k++) {
                System.out.print(" ");
            }
            if(row==1){
                for(int col = 0;col<2*n-2*row+1;col++){
                    System.out.print("*");
                }
            }else{
                for(int col = 0;col<2*n-2*row+1;col++){
                    if(col==0|| col==2*n-2*row){
                    System.out.print("*");}
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
