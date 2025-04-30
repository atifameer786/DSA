
public class DoublyLinkedList {

    static class ListNode {

        int val;
        ListNode prev;
        ListNode next;

        ListNode() {
            val = 0;
            prev = null;
            next = null;
        }

        ListNode(int data1) {
            this.val = data1;
            prev = null;
            next = null;
        }

        ListNode(int data1, ListNode prev1, ListNode next1) {
            val = data1;
            prev = prev1;
            next = next1;
        }

    }

    public ListNode insertBeforeHead(ListNode head, int X) {

        ListNode tmp = new ListNode(X);
        tmp.prev = null;
        tmp.next = head;
        head.prev = tmp;
        head = tmp;
        return head;

    }

    public ListNode deleteHead(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode tmp = head.next;
        tmp.prev = null;
        head.next = null;
        return tmp;

    }

    public static ListNode deleteTail(ListNode head) {

        ListNode p = head;
        if (head == null || head.next == null) {
            return null;
        }

        while (p.next != null) {
            p = p.next;
        }
        ListNode q = p.prev;
        q.next = null;
        p.prev = null;
        return head;

    }

    public ListNode deleteKthElement(ListNode head, int k) {

        if (head == null || k < 1) {
            return head; // Nothing to delete
        }
        // Special case: deleting the head
        if (k == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        ListNode p = head;
        for (int i = 1; i < k; i++) {
            p = p.next;
            if (p == null) {
                // k is out of bounds
                return head;
            }
        }
        if (p.prev != null) {
            p.prev.next = p.next;
        }
        if (p.next != null) {
            p.next.prev = p.prev;
        }

        return head;

    }

    public void deleteGivenNode(ListNode node) {

        ListNode previous = node.prev;
        ListNode front = node.next;

        if (front == null) {
            previous.next = null;
            node.prev = null;
            return;
        }

        previous.next = front;
        front.prev = previous;

        node.next = null;
        node.prev = null;

    }

    public ListNode insertBeforeTail(ListNode head, int X) {

        if (head == null) {
            return new ListNode(X); // new node becomes the head
        }
        if (head.next == null) {
            ListNode tmp = new ListNode(X, head, null);
            head.prev = tmp;
            tmp.next = head;
            return tmp;
        }
        ListNode tmp = new ListNode(X);

        ListNode tail = head;
        ListNode q = null;

        while (tail.next != null) {
            q = tail;
            tail = tail.next;
        }
        tmp.next = tail;
        tail.prev = tmp;
        q.next = tmp;
        tmp.prev = q;

        return head;

    }

    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {

        // if inserting position is invalid
        if (K <= 0) return head;

        // if insering postion is befor head node
        // use constructor to create new node with next point to head and prev to null
        if(K==1){
        ListNode tmp = new ListNode(X,head,null);
        head.prev = tmp;
        head = tmp;
        return tmp;
        }

        // take tmp to kth postion 
        ListNode tmp = head;
        for(int i=1;i<K && tmp != null ;i++){
            tmp = tmp.next;
        }
        ListNode prev = tmp.prev;
        ListNode newlistnode = new ListNode(X,tmp,prev);
        prev.next = newlistnode;
        tmp.prev = newlistnode;

        return head;
    
    }

    public void insertBeforeGivenNode(ListNode node, int X) {

        while(node !=null && node.val!=X){
            node = node.next;
        }

        if(node==null){
            return ;
        }
        ListNode prevnode = node.prev;
        ListNode newnode = new ListNode(X,node,prevnode);
        prevnode.next = newnode;
        newnode.prev = prevnode;


    }

    private static ListNode arrayToLinkedList(int[] nums) {
        if (nums.length == 0)
            return null;

        ListNode head = new ListNode(nums[0]);
        ListNode prev = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            prev.next = temp;
            temp.prev = prev; // ✅ properly link backward
            prev = temp;
        }

        return head;
    }

    // Helper Function to print the linked list
    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // main method

        int[] nums = { 1, 2, 3, 4, 5 };

        // Creating the doubly linked list from given array
        ListNode head = arrayToLinkedList(nums);

        // Print the Original list
        System.out.print("Original List: ");
        printLL(head);

        // Create an instance of Solution class

        // Function call to delete the tail of the doubly linked list
        head = deleteTail(head);

        // Print the Modified list
        System.out.print("Modified list: ");
        printLL(head);

    }

}
