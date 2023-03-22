package Generics.Comparing;

import Interfaces.Car;

public class Student implements Comparable<Student> {
    int marks;
    int rollno;

    public Student(int rollno,int marks){
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student o) {
        int diff= (int)this.rollno-o.rollno;
        return diff;
    }

    @Override
    public String toString() {
        return "MArks :" + this.marks + " Rollno :" + this.rollno;
    }
}
