package ds.queue;

import java.util.NoSuchElementException;

public class Queue {

    private Node front;
    private Node rear;
    private int length;

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmtpy() {
        return length == 0;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (isEmtpy()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public void print() {
        if (isEmtpy()) {
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -->");
            current = current.next;
        }
        System.out.println("null");

    }

    public int dequeue(){
        if(isEmtpy()){
            throw new NoSuchElementException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public int first(){
        if(isEmtpy()){
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public int last(){
        if(isEmtpy()){
            throw new NoSuchElementException("Queue is empty");
        }
        return rear.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.print();

        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();

        queue.enqueue(50);
        queue.enqueue(60);
        queue.print();

        System.out.println(queue.first());
        System.out.println(queue.last());
    }
}
