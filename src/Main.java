public class Main {
    public static void main(String[] args) {

        Node first = new Node(1);
        Node second = new Node(2);
        Node last = new Node(3);

        first.next = second;
        second.next=last;
        last.next=first;



    }
}