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
        list.display();
        int[] arr = new int[5];
        System.out.println(arr.length);
    }
}