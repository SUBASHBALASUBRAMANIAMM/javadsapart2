package inheritance;

public class Main {
    public static void main(String[] args) {
        //Box box = new Box();
       // Box box = new Box(4);
       // Box box = new Box(4,6.2,7.7);

       //  Box box1 = new Box(4,6.2,7.7);

//        Box box2 = new Box(box1);
//        System.out.println("l = "+box2.length+" h= "+box2.height+" w = "+box2.width);

      //  BoxWeight box3 = new BoxWeight();
        // the height of the box3 will be given by the parent clss Box such that this boxWeight object gets the property of the parent
       // System.out.println("height = "+ box3.height + " weight =" + box3.weight);

     //   BoxWeight box4 = new BoxWeight(2,3,4,5);
        // if any variable is private in parent class it cant be accessed by child class

        //java allows the parent class reference and child class object but not vice versa for ecampl

       // Box box5 = new BoxWeight(1,2,3,4);// this is allowed
        // BoxWeight box6 = new Box(1,2,3); -> this is not allowed as weight cant be initialised from Box(parent) object
        BoxPrice box7  = new BoxPrice();
        box7.cost = 4;
        box7.weight=8;
        System.out.println(box7.weight);
        BoxPrice box8  = new BoxPrice(box7);
        System.out.println(box8.weight);



    }

}
