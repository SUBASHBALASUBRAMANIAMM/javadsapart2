import java.util.Arrays;

public class practice {
    public static void main(String args[]){
        int count=0;
        int [] number={1,2,3,5,1,5,};
        Arrays.sort(number);//1,2,3,4,5
        int number2[]=new int[number.length/2];
        for(int i =0;i<number.length/2;i++){
            int temp=number[i]+ number[number.length-1];
            number2[i]=temp;
            System.out.println(Arrays.toString(number));
            Arrays.sort(number2);
        }
        for(int i=0; i<number2.length/2;i++){
            if(number2[i]!=number[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }

}
