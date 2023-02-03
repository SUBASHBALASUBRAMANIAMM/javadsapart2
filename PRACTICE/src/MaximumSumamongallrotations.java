import java.util.*;
public class MaximumSumamongallrotations {
        public static void main(String []args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = in.nextInt();
                //System.out.println(arr[i]);
            }
            int sum =0;
            int max =0;
            for(int i =0;i<arr.length;i++){
                rotation(arr);
                sum =0;
                for(int j = 0;j<arr.length;j++){
                    sum = sum + (j*arr[j]);
                }
                //System.out.println(sum);
                if(max<sum){
                    max = sum;
                }

            }
            System.out.println(max);


        }
        public static void rotation(int[] arr){
        int temp1 = arr[0];
        int temp2 =0;
        arr[0]=arr[arr.length-1];
        for(int i = 1; i<arr.length;i++){
        temp2 = arr[i];
        arr[i] = temp1;
        temp1 = temp2;
        }
        }

}
