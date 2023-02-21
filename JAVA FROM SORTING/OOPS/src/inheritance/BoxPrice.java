package inheritance;

public class BoxPrice extends  BoxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice otherr){
        super(otherr);
        this.cost = otherr.cost;
    }

    public BoxPrice(double length, double height, double width, double weight, double cost) {
        super(length, height, width, weight);
        this.cost = cost;
    }
}
