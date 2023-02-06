import java.util.Arrays;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int arr[] = {-10,12,-20,-8,15};

        //System.out.println(A);
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]==2*arr[i] ||arr[i]==2*arr[j] ){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}

