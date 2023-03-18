package oopsChallenge;

public class Eye extends Organs {
    private String color;
    private boolean isOpened;
    public Eye(String name,String medicalCondition,String color,boolean isOpened){
        super(name,medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("color :" + this.color);
    }
    public void open(){
        this.setOpened(true);
        System.out.println("The eye is opened");
    }
    public  void close(){
        this.setOpened(false);
        System.out.println("The eye is closed");
    }



    public void setOpened(boolean isOpened){
        this.isOpened = isOpened;

    }
    public boolean isOpened(){
        return isOpened;
    }


}
