package oopsChallenge;

public class Patient {
    private String name;
    private  int age;

    private Eye lefteye;
    private Eye righteye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye lefteye, Eye righteye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



    public Eye getLefteye() {
        return lefteye;
    }



    public Eye getRighteye() {
        return righteye;
    }


    public Heart getHeart() {
        return heart;
    }



    public Stomach getStomach() {
        return stomach;
    }


    public Skin getSkin() {
        return skin;
    }


}
