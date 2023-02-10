public class PATTERN5 {
    public static void main(String[] args) {
         int n =5;
         int temp =0;
         for(int row = 0;row<2*n;row++){
             if (row>n){
                 temp = 2*n-row;
             }else temp =row;
             for(int col=0;col <temp;col++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
