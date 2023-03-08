public class MinimumTimetoCompleteTrips {
    //https://leetcode.com/problems/minimum-time-to-complete-trips/description/
    public static void main(String[] args) {
        int [] time =  {1,2,3};
        int totalTrips = 5;
        int sum =0;
        int t =1;

        while(totalTrips !=sum){
            sum =0;
            for(int i =0;i<time.length;i++){
                sum = sum + t/time[i];
            }
            if(sum == totalTrips){
                System.out.println(t);
                break;
            }else{
                t++;
            }
        }
    }
}
