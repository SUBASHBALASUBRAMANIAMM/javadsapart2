public class LL {

    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }
    public void  insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        node = tail;
        size++;
    }
    public void insertAt(int pos,int val){
        Node temp = head;
        for (int i = 1; i <pos ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
