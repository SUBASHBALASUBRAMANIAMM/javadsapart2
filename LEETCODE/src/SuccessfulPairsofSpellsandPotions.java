import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int success = 7;
        int[] arr = new int[spells.length];
        Arrays.sort(potions);
        int max =0;
        for(int i=0;i<spells.length;i++){
            max =0;
            int left =0;
            int right = potions.length-1;
            while(left<=right){
                int mid = (left + right)/2;
                if(spells[i]*potions[mid]>=success){
                    max = potions.length - mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            arr[i] = max;
        }
        System.out.println(Arrays.toString(arr));
    }
}
