import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        list.insertFirst(10);
        list.insertAtEnd(95);
        list.insertAt(3,8);
        list.insertAt(7,100);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

        System.out.println(LocalDateTime.now());



    }
}