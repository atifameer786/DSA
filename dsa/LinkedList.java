import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data1) {
            val = data1;
            next = null;
        }

        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }

    public static List<Integer> deleteHead(ListNode head) {

        ListNode tmp = head.next;
        List<Integer> ans = new ArrayList<>();

        while (tmp != null) {

            ans.add(tmp.val);
            tmp = tmp.next;
        }

        return ans;

    }

    public ListNode deleteHeadNode(ListNode head) {

        if (head != null) {
            return head.next;
        }
        return null;

    }

    public ListNode deleteTail(ListNode head) {

        ListNode tmp = head;
        ListNode tail = null;

        if (head == null || head.next == null) {
            return null;
        }
        while (tmp.next != null) {

            tail = tmp;
            tmp = tmp.next;

        }
        tail.next = null;
        return head;
    }

    public ListNode deleteKthNode(ListNode head, int k) {

        if (head == null || k <= 0)
            return head;

        // If k is 1, delete the head node
        if (k == 1) {
            ListNode temp = head;
            head = head.next;
            temp.next = null; // help GC
            return head;
        }

        ListNode p = head;
        ListNode q = null;
        for (int i = 1; i < k && p != null; i++) {
            q = p;
            p = p.next;
        }

        if (p != null && q!=null) {
            q.next = p.next;
            p.next = null;
        }
        return head;

    }

    public ListNode deleteNodeWithValueX(ListNode head, int X) {

        if(head == null || X ==1){
            return null;
        }

        ListNode p = head;
        ListNode q = null;
        while(p!=null){
            if(p.val == X){
                break;
            }
            q = q.next;
            p = p.next;
        }

        if(p!=null && q!=null){
            q.next = p.next;
            p.next = null;
        }
        
        return head;

    }

    // 
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode tmp= new ListNode(X);
        tmp.next = head;
        head = tmp;
        return head;


    }

    // if you want to insert at tail you need one pointer which give us the index of tail
    public ListNode insertAtTail(ListNode head, int X) {

        ListNode p = new ListNode(X);
        ListNode tmp = head;
        while(tmp !=null){
            tmp = tmp.next;
        }
        tmp.next = p;
        p.next = null;
        return head;

    }

    public ListNode insertAtKthPosition(ListNode head, int X, int K) {

        ListNode p = new ListNode(X);
        if (K == 1) {
            p.next = head;
            return p;
        }
        
        if (head == null) {
            return null;
        }
        ListNode tmp = head;
        for(int i=1;i<K-1;i++){
            tmp = tmp.next;
        }
        tmp.next = p;
        p.next = tmp.next;
        

        return head;
    }

    public ListNode insertBeforeX(ListNode head, int X, int val) {

        if(head==null){
            return null;
        }
        if(head.val == X){
            return new ListNode(val,head);
        }
        ListNode p = head;
        ListNode q = null;
        ListNode tmp = new ListNode(val);
        
        while(p!=null || p.val!=val){
            q = p;
            p = p.next;
        }
        tmp.next =q.next;
        q.next = tmp;

        return head;

    }

    public static void main(String[] args) {

        ListNode y1 = new ListNode(2);
        ListNode y2 = new ListNode(5);
        ListNode y3 = new ListNode(8);
        ListNode y4 = new ListNode(7);

        // Linking the nodes
        y1.next = y2;
        y2.next = y3;
        y3.next = y4;

        // List<Integer> result = deleteHead(y1);

        // System.out.println("Linked List Values:");
        // for (int val : result) {
        // System.out.print(val + " ");
        // }
        // System.out.println();

        LinkedList ll = new LinkedList(); // Create an instance to call non-static method
        ListNode newHead = ll.deleteKthNode(y1, 2); // Remove the head

        System.out.println("Linked List after deleting head:");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();

    }

}
