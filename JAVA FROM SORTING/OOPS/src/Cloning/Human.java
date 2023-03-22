package Cloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name,int age ){
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,4,5,6};
    }
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is a shallow copy
//        return super.clone();
        Human twin = (Human)super.clone();// this is actually shallow copy
        //this is a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
