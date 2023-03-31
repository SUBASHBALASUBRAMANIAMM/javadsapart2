public class perfectsquare {
    //https://leetcode.com/problems/valid-perfect-square/
    public static void main(String[] args) {
        int num = 14;
       

                if(num==1){
                    System.out.println("true");}
                long start=2;
                long end=num/2;
                while(start<=end){
                    long mid = start+(end-start)/2;
                    if(mid * mid == num){ System.out.println("true");}

                    else if(mid * mid > num){
                        end=mid-1;
                    }
                    else if( mid * mid < num){
                        start=mid+1;
                    }
                    else { System.out.println("true");}
                }
        System.out.println("flalse");
            }
        }

