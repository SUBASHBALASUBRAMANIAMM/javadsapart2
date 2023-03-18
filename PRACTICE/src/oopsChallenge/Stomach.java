package oopsChallenge;

public class Stomach extends Organs {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

        public void digest(){
            System.out.println("digesting begin..");
        }
    public void getDetails(){
        super.getDetails();
        if(this.isEmpty()){
            System.out.println("Need to eat something..");
        }else{
            System.out.println("The stomach is full..");
        }
    }
    public boolean isEmpty() {
        return isEmpty;
    }


}
