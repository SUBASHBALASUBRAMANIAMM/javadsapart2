public class AddDigits {
    //https://leetcode.com/problems/add-digits/
    public static void main(String[] args) {
        int num =38;
        int sum =0;
        do{

            while(num>0){
                int digit = num%10;
                num = num/10;
                sum = sum + digit;
            }
            num = sum;

        }while(sum >9);

        System.out.println(sum);
    }
}
