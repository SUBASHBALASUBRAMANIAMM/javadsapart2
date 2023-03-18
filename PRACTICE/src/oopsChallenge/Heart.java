package oopsChallenge;

public class Heart extends Organs {
    private int heartRate;

    public Heart(String name,String medicalCondition,int heartRate){
        super(name,medicalCondition);
        this.heartRate = heartRate;
    }

        @Override
        public void getDetails(){
        super.getDetails();
            System.out.println("The heart rate is " + heartRate);
        }
    public void setHeartRate(int heartRate){
        this.heartRate = heartRate;
        System.out.println("The heart rate is changed to " + heartRate);
    }


}
