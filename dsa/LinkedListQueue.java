class LinkedListQueue {

    public class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    private Node rear,front;
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        
    }

    public void push(int x) {

        Node newNode = new Node(x);

        if(rear !=null){
            front = newNode;
            rear = newNode;
        }

        rear.next = newNode;
        rear =newNode;

       
    }

    public int pop() {

        if(front == null){
            return -1;
        }

        int p = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return p ;
        
      
    }

    public int peek() {
        if(front == null){
            return -1;
        }

        return front.data;
        
    }

    public boolean isEmpty() {

        return front==null;
    }
}
