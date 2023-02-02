public class divide {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor =2;
        for(int i =1 ;i<dividend;i++){
            if((divisor* i) >dividend){
                System.out.println(i-1);
                break;
            }
        }
    }
}
