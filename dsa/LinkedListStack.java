public class LinkedListStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    private Node top;
    // private int size;
    public LinkedListStack() {
        this.top = null;
        // size = 0;
    }

    public void push(int x) {

        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        // size++;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int val = top.data;
        Node p = top;
        top = top.next;
        p.next = null;
        return val;
    }

    public int top() {

        if(top==null){
            return -1;
        }

        return top.data;

    }

    public boolean isEmpty() {
        return top ==null;
    }

}
