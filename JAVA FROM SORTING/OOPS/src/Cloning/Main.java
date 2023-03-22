package Cloning;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human people1 = new Human("loga",35);
//        Human people2 = new Human(people1);
//        System.out.println(people2.age);
        Human people2 = (Human)people1.clone();
        System.out.println(people2.age);
        people2.arr[0]=100;
        System.out.println(Arrays.toString(people1.arr));
    }
}
