package ds.linkedlist;

import java.util.DuplicateFormatFlagsException;

public class SinglyLinkedListOperations {
    private static Node head;

    public static void main(String[] args) {
        SinglyLinkedListOperations sl = new SinglyLinkedListOperations();
        sl.insertBeginning(11);
        sl.insertBeginning(8);
        sl.insertBeginning(34);
        sl.insertLast(45);
        sl.insertLast(0);
        sl.insertLast(63);
        sl.display();
        sl.insert(1, 55);
        sl.insert(4, 65);
        sl.display();

        System.out.println(sl.deleteFirst().data);
        sl.display();
        System.out.println(sl.deleteFirst().data);
        sl.display();

        System.out.println(sl.deleteLast().data);
        System.out.println(sl.deleteLast().data);
        sl.display();

        sl.delete(3);
        sl.display();

        if (sl.find(head, 45)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sl.insertBeginning(13);
        sl.insertBeginning(9);
        sl.insertBeginning(78);

        System.out.println("Before reverse");
        sl.display();
        head = sl.reverse(head);
        System.out.println("After reverse");
        sl.display();

        System.out.println("Middle Node: " + sl.getMiddleNode().data);

        Node nthNodeFromEnd = sl.getNthNodeFromEnd(3);
        System.out.println("Nth Node from end: " + nthNodeFromEnd.data);

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

    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    public void insert(int position, int data) {
        Node node = new Node(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            Node prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            Node current = prev.next;
            prev.next = node;
            node.next = current;
        }
    }

    public Node deleteFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public Node deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return current;
    }

    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            Node current = prev.next;
            prev.next = current.next;
        }
    }

    public boolean find(Node head, int searchKey) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public Node getMiddleNode() {
        if (head == null) {
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }

    public Node getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value n: " + n);
        }

        Node mainPtr = head;
        Node refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }


}
