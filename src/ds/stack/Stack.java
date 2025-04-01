package ds.stack;

import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int length;

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getData();
    }
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(15);
        stack.push(25);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}
