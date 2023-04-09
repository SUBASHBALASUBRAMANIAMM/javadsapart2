public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,5,6,4,5};
        int unique =0;
        for(int i :arr){
            unique = unique^i;
        }
    }
}
