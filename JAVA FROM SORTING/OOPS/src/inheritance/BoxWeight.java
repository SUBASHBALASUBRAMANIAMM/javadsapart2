package inheritance;

public class BoxWeight extends Box{
    double weight ;

    BoxWeight(){

        this.weight =-1;
    }


     BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);// it will be calling the parent class constructor
         // used to initialise the value present in parent class
         // System.out.println(super.weight); -> this will be used to access the parent class directly as same name is present
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}
