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
        System.out.print("END" );
        System.out.println();
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
        if(pos == 0){
            insertFirst(val);
            return;
        }
        if(pos == size){
            insertAtEnd(val);
            return;
        }
        for (int i = 1; i <pos ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public  int  deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0 ){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    private class Node{
        private int value;
        private Node next;

        public  Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
