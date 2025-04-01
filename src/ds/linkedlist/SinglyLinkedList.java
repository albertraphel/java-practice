package ds.linkedlist;

public class SinglyLinkedList {
    private Node head;

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();

        sl.head = new Node(1);
        Node second = new Node(6);
        Node third = new Node(13);
        Node fourth = new Node(4);

        sl.head.next = second;
        second.next = third;
        third.next = fourth;

        sl.display();
        System.out.println("Length of Linked List: " + sl.findLength(sl));
    }

    private int findLength(SinglyLinkedList sl) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    //Prints the linked list
    private void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //Find the length of Linked List


}
