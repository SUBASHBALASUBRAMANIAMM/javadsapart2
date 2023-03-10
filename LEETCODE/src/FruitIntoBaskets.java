import java.util.Arrays;

public class FruitIntoBaskets {
    //https://leetcode.com/problems/fruit-into-baskets/
    public static void main(String[] args) {
        int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
        int max = 0, count = 0;
        for (int i = 0, first = 0, second = -1; i < tree.length; i++) {
            count++;
            if (tree[i] == tree[first]) {
                first = i;
            } else if (second == -1 || tree[i] == tree[second]) {
                second = i;
            } else {
                max = Math.max(count - 1, max);
                count = Math.abs(first - second) + 1;
                first = i - 1;
                second = i;
            }
        }
        System.out.println( Math.max(count, max));

    }
}
