import java.util.ArrayList;

public class SpiralMatrix {
    //https://leetcode.com/problems/spiral-matrix/
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
                            } ;
        int top =0;
        int down =matrix.length-1;
        int left =0;
        int right =matrix[0].length-1;
        int dir =0;

        while(top <=down&&left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    System.out.println(matrix[top][i]);

                }
                top = top +1;
            }else if(dir==1){
                for(int i=top;i<=down;i++){
                    System.out.println(matrix[i][right]);
                }
                right = right-1;
            } else if (dir==2) {
                for (int i = right; i >=left ; i--) {
                    System.out.println(matrix[down][i]);
                }
                down = down-1;

            } else if (dir==3) {
                for (int i = down; i >=top ; i--) {
                    System.out.println(matrix[i][left]);
                    left = left+1;
                }

            }

            dir = (dir+1)%4;
        }
    }
}
