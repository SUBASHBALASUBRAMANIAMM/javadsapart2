import java.util.Arrays;

public class DefusetheBomb {
    //https://leetcode.com/problems/defuse-the-bomb/description/
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;
        int arr[] = new int[code.length];
        int sum =0;
        int count=0;
        if(k==0) System.out.println(Arrays.toString(arr));
        if(k>0){
            for(int i=0;i<arr.length;i++){
                sum=0;
                count=0;
                for(int j=i+1;count<k;j++){
                    if(j==code.length){
                        j=0;
                    }
                    sum = sum + code[j];
                    count++;

                }
                arr[i] = sum;
            }
            System.out.println(Arrays.toString(arr));
        }
        if(k>0){
            for(int i=0;i<arr.length;i++){
                sum=0;
                count=0;
                for(int j=i+1;count<k;j++){
                    if(j==code.length){
                        j=0;
                    }
                    sum = sum + code[j];
                    count++;

                }
                arr[i] = sum;
            }
            System.out.println(Arrays.toString(arr));
        }
        if(k<0){
            k = -k;
            for(int i=0;i<arr.length;i++){
                sum=0;
                count=0;
                for(int j=i-1;count<k;j--){
                    if(j==-1){
                        j=arr.length-1;
                    }
                    sum = sum + code[j];
                    count++;

                }
                arr[i] = sum;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
