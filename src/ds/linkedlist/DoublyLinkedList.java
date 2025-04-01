package ds.linkedlist;

public class DoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        return length;
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(15);
        dll.insertFirst(25);
        dll.insertLast(35);
        dll.insertLast(45);
        dll.insertLast(55);
        dll.displayForward();
        dll.displayBackward();
    }

    public void displayForward(){
        if(head == null){
            return;
        }
        DNode temp = head;
        while(temp !=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void displayBackward(){
        if(tail == null){
            return;
        }
        DNode temp = tail;
        while(temp !=null){
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertFirst(int value){
        DNode newNode = new DNode(value);
        if(isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length ++;
    }

    public void insertLast(int value){
        DNode newNode = new DNode(value);
        if(isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        length++;
    }
}
