import java.util.Arrays;

public class practice {
    public static void main(String args[]) {

        int [] err = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < err.length; i++) {
            if(err[i] > 0){
                System.out.println(err[i]);
                break;
            }
            System.out.println("hi");

        }
    }
}
