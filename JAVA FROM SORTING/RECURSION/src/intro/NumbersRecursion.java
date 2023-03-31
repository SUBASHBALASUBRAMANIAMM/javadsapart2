package intro;

public class NumbersRecursion {
    public static void main(String[] args) {
        printnum(1);
    }
    static void printnum(int num){
        if(num==5){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printnum(num+1);
    }

}
