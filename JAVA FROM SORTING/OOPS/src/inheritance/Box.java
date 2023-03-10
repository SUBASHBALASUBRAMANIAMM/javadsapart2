package inheritance;

public class Box {
   private double length;
    double height;
    double width;

    Box(){
        this.length =-1;
        this.height = -1;
        this.width=-1;
    }

    // for creating cube
    Box(int side){
        this.height =side;
        this.width =side;
        this.length = side;
        //double =weight;
    }

   Box(double length, double height, double width) {
        super(); // Object class
        this.length = length;
        this.height = height;
        this.width = width;
    }
    Box(Box old){
        this.width=old.width;
        this.height = old.height;
        this.length= old.length;
    }

    static void displayinfo(){
        System.out.println("running the box");
    }
}
