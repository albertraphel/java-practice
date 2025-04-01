package ds.ll2;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private Node last;
    private int length;

    public CircularLinkedList() {
        last = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }


    public void createCircularLinkedList() {
        Node first = new Node(1);
        Node second = new Node(5);
        Node third = new Node(10);
        Node fourth = new Node(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    public void display() {
        if (last == null) {
            return;
        }
        Node first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data) {
        Node temp = new Node(data);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data) {
        Node temp = new Node(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }


    public Node removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("CircularLinkedList is already empty");
        }
        Node temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.createCircularLinkedList();
        cl.display();

        cl.insertFirst(20);
        cl.insertFirst(30);
        cl.display();

        cl.insertLast(40);
        cl.insertLast(50);
        cl.display();

        cl.removeFirst();
        cl.display();
    }
}
