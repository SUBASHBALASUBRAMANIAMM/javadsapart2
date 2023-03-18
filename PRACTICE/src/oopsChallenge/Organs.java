package oopsChallenge;

public class Organs {
    private String name;
    private String medicalCondition;

    public Organs(String name, String medicalCondition){
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void getDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Medical Condition : " + this.medicalCondition);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMedicalCondition(String medicalCondition){
        this.medicalCondition = medicalCondition;
    }
    public String getMedicalCondition(){
        return medicalCondition;
    }


}

