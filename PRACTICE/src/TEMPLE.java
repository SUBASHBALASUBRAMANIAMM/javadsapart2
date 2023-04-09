public class TEMPLE {
    public static void main(String[] args) {
        int temple =5;
        float val =72;
        float temp = val;
        float prev=0;
        while(temple!=1){
            prev = val/2 + temp;
            val = prev;
            temple--;
        }
       float ans = prev/2;
        System.out.println(ans);
    }
}
