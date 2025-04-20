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

        // return head != null ? head.next : null;

        if (head != null) {
            return head.next;
        }
        return null;

    }

    public ListNode deleteTail(ListNode head) {

        ListNode tmp = head;
        ListNode tail = head;

        if (head == null || head.next == null) {
            return null;
        }

        while (tmp != null) {

            tmp = tmp.next;

            if (tmp != null) {
                tail = tail.next;
            }

        }

        return tail;

    }

    public ListNode deleteKthNode(ListNode head, int k) {

        ListNode tmp = head;
        ListNode tail = null;
        int count = 0;
        while(tmp!=null){
            tail = tail.next;
            count++;
            tmp = tmp.next;
            if(count==k){
                break;
            }
        }
        tail = tmp.next;
        tmp = tmp.next;

        return tmp;

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
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        LinkedList ll = new LinkedList(); // Create an instance to call non-static method
        ListNode newHead = ll.deleteKthNode(y1,2); // Remove the head

        System.out.println("Linked List after deleting head:");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();

    }

}
