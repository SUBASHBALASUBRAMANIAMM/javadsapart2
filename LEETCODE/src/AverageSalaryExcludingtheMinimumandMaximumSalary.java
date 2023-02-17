import java.util.*;
public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        Arrays.sort(salary);
        System.out.println(Arrays.toString(salary));
        double sum =0;
        for(int i =1 ;i<=salary.length-2;i++){
            sum = sum+ salary[i];
        }
        System.out.println(sum);
        double ans = sum/(salary.length -2);
        System.out.println(ans);
    }
}
