package Enum;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //these are public,static,final
        // as it is final we cant create a child
        // these are Week type
        Week(){
            System.out.println("constructor called for " + this);
        }
        // this is not public or protected only private or default

    }


    public static void main(String[] args) {
        Week week = Week.Monday;
//        Week week1 =

        for(Week day : Week.values()){
            System.out.println(day);
        }
    }
}
