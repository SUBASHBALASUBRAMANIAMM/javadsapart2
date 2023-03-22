package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student subash = new Student(1,80);
        Student s1 = new Student(2,100);
        Student s2 = new Student(3,40);
        Student s3 = new Student(4,50);
        Student s4 = new Student(5,22);
        Student s5 = new Student(6,99);

/*
        if(subash.compareTo(s1) <0){
            System.out.println("s1 has higher marks than subash");

        }else{
            System.out.println("subash has the higher marks than subash");
        }
*/

        Student[] arr = {subash, s1, s2, s3, s4, s5};
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        Arrays.sort(arr, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks);
//            }
//        });

        Arrays.sort(arr,(o1,o2 ) -> (int)(o1.marks- o2.marks));
        System.out.println(Arrays.toString(arr));
    }
}
