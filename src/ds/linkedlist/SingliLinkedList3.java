package ds.linkedlist;

public class SingliLinkedList3 {
    private Node head;

    public static void main(String[] args) {
        SingliLinkedList3 sl = new SingliLinkedList3();
        sl.insertLast(1);
        sl.insertLast(1);
        sl.insertLast(2);
        sl.insertLast(3);
        sl.insertLast(3);
        sl.insertLast(8);
        sl.insertLast(16);
        sl.insertLast(19);
        sl.display();

        System.out.println("Before removing duplicates");
        sl.display();
        sl.removeDuplicate();
        System.out.println("After removing duplicates");
        sl.display();

        sl.insertInSortedLL(11);
        System.out.println("After inserting 11");
        sl.display();

        sl.deleteNode(11);
        sl.display();

        sl.creatLoopInLinkedList();
        System.out.println("Contains Loop: " + sl.containsLoop());

        System.out.println("Start Node: " + sl.startNodeInALoop().data);

        sl.removeLoop();
        sl.display();
        System.out.println("Contains Loop: " + sl.containsLoop());

        SingliLinkedList3 sl2 = new SingliLinkedList3();
        sl2.insertLast(1);
        sl2.insertLast(4);
        sl2.insertLast(6);
        sl2.insertLast(8);
        sl2.insertLast(23);
        SingliLinkedList3 sl3 = new SingliLinkedList3();
        sl3.insertLast(3);
        sl3.insertLast(5);
        sl3.insertLast(11);
        sl3.insertLast(13);

        sl2.display();
        sl3.display();

        SingliLinkedList3 result = new SingliLinkedList3();
        result.head = sl.merge(sl2.head, sl3.head);
        System.out.println("Merged Linked List: ");
        result.display();
    }

    public void insertLast(int data) {
        if (head == null) {
            head = new Node(data);
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    private void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }

    //How to remove duplicate from sorted Singy Linked List in Java?
    public void removeDuplicate() {
        if (head == null) {
            return;
        }
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }


    //How to insert a node in a sorted Singly Linked List in Java ?
    public Node insertInSortedLL(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }
        if (value < head.data) {
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        Node temp = null;

        while (current != null && current.data < value) {
            temp = current;
            current = current.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }


    //How to remove a given key from Singly Linked List in Java?
    public void deleteNode(int key) {
        Node current = head;
        Node temp = null;

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        temp.next = current.next;
    }

    //Detect a loop in a Singly Linked List in Java | Implementation
    public boolean containsLoop() {
        Node fastPrt = head;
        Node slowPtr = head;

        while (fastPrt != null && fastPrt.next != null) {
            fastPrt = fastPrt.next.next;
            slowPtr = slowPtr.next;
            if (fastPrt == slowPtr) {
                return true;
            }
        }

        return false;
    }

    public void creatLoopInLinkedList() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }


    public Node startNodeInALoop() {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return getStartNode(slowPtr);
            }
        }
        return null;
    }

    private Node getStartNode(Node slowPtr) {
        Node temp = head;

        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void removeLoop() {
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                breakLoop(slowPtr);
                return;
            }
        }
    }

    private void breakLoop(Node slowPtr) {
        Node temp = head;
        while (temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }


    public Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;
    }

}
