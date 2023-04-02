import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int success = 7;
        int[] arr = new int[spells.length];
        int least =0;
        Arrays.sort(potions);
        for(int i =0;i<spells.length;i++){
            least =0;
            for(int j =0;j<potions.length;j++){
                long check = (long)spells[i]*potions[j];
                if( check>= success){
                    least = j;
                    break;
                }
            }
            if(least >0){
                arr[i] = potions.length - least;
            }
            else{
                arr[i] = least;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
