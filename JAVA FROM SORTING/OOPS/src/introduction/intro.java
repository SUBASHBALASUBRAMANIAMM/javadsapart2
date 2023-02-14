package introduction;

public class intro {
    public static void main(String[] args) {
         Student student1 = new Student("subash",1,20);
//        student1.name = "subash";
//        student1.age = 20;
//        student1.rollno = 1;
         student1 = new Student("logu",2,20);
        for (int i = 0; i < 1000000; i++) {
            Student student3 = new Student();
            student3 = student1;
        }

    }

}
class Student{
    String name;
    int rollno;
    int age;
    final String collegename = "BIT";
    Student(){
//        this.name="default name";
////        this.rollno =100;
////        this.age = 100;
        this("default name",100,100);
    }
    Student(String name,int rollno,int age){
        this.name =name;
        this.rollno = rollno;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("the objet is deleted");
    }
}
