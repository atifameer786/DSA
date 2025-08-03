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

        if (p != null && q != null) {
            q.next = p.next;
            p.next = null;
        }
        return head;

    }

    public ListNode deleteNodeWithValueX(ListNode head, int X) {

        if (head == null || X == 1) {
            return null;
        }

        ListNode p = head;
        ListNode q = null;
        while (p != null) {
            if (p.val == X) {
                break;
            }
            q = q.next;
            p = p.next;
        }

        if (p != null && q != null) {
            q.next = p.next;
            p.next = null;
        }

        return head;

    }

    //
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode tmp = new ListNode(X);
        tmp.next = head;
        head = tmp;
        return head;

    }

    // if you want to insert at tail you need one pointer which give us the index of
    // tail
    public ListNode insertAtTail(ListNode head, int X) {

        ListNode p = new ListNode(X);
        ListNode tmp = head;
        while (tmp != null) {
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
        for (int i = 1; i < K - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = p;
        p.next = tmp.next;

        return head;
    }

    public ListNode insertBeforeX(ListNode head, int X, int val) {

        if (head == null) {
            return null;
        }
        if (head.val == X) {
            return new ListNode(val, head);
        }
        ListNode p = head;
        ListNode q = null;
        ListNode tmp = new ListNode(val);

        while (p != null || p.val != val) {
            q = p;
            p = p.next;
        }
        tmp.next = q.next;
        q.next = tmp;

        return head;

    }

    public static List<Integer> LLTraversal(ListNode head) {

        ArrayList<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.val);
            head = head.next;
        }
        return ans;

    }

    public static ListNode sortList(ListNode head) {
        if (head == null)
            return null;
        ListNode p = head;

        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        while (p != null) {
            if (p.val == 0) {
                zeroes++;
            } else if (p.val == 1) {
                ones++;
            } else {
                twos++;
            }
            p = p.next;
        }

        p = head;

        for (int i = 0; i < zeroes; i++) {
            p.val = 0;
            p = p.next;
        }
        for (int j = 0; j < ones; j++) {
            p.val = 1;
            p = p.next;
        }
        for (int k = 0; k < twos; k++) {
            p.val = 2;
            p = p.next;
        }

        return head;

    }

    public ListNode sortListOptimal(ListNode head) {
        if (head == null)
            return null;
        ListNode p = head;

        ListNode zeroes = new ListNode(-1);
        ListNode ones = new ListNode(-1);
        ListNode twoes = new ListNode(-1);

        ListNode zero = zeroes;
        ListNode one = ones;
        ListNode two = twoes;

        while (p != null) {

            if (p.val == 0) {
                zero.next = p;
                p = p.next;
                zero = zero.next;
            } else if (p.val == 1) {
                one.next = p;
                p = p.next;
                one = one.next;
            } else {
                two.next = p;
                p = p.next;
                two = two.next;
            }
        }

        if (ones.next != null) {
            zero.next = ones.next;

        } else {
            zero.next = twoes.next;
        }
        one.next = twoes.next;
        two.next = null;

        return zeroes;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        

        int counter = 0;
        ListNode p = head;
        ListNode q = null;

        while(p!=null){
            counter++;
            p = p.next;
        }
        int d = counter -n +1;
        p = head;
        

        for(int i=1;i<d;i++){
            q = p ;
            p = p.next;
        }
        if(p.next!=null){
            q.next = p.next;
        }

        return head;
        

    }


    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> al = new ArrayList<>();

        ListNode p = head;
        while (p!=null) {
            al.add(p.val);
            p= p.next;
        }
        p = head;
        int size = al.size();
        for(int i=size-1;i>=0;i--){
            p.val = al.get(i);
            p = p.next;
        }
        return head;
        
    }


    public static ListNode reverseListOptimal(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        
        while (curr!=null) {
         ListNode nextNode = curr.next;
         curr.next = prev;
         prev = curr;
         curr = nextNode;  
        }

        return prev;
    }


    public static void printLinkList(ListNode head){

        ListNode tmp = head;

        while(tmp!=null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println();

    }

    public static int sum(ListNode head){

        if(head==null){
            return 0;
        }
        else{
            return sum(head.next) + head.val;
        }
    }

    public static int max(ListNode head){
        int m = Integer.MIN_VALUE;
        int x = 0;
        if(head == null){
            return m;
        }
        else{
            x = max(head.next);
            if(x>head.val){
                return x;
            }
            else{
                return head.val;
            }

        }

    }

    public static boolean search(ListNode head,int key){

        while(head != null){
            if(head.val == key){
                return true;
            }
            else{
                head = head.next;
            }
        }
        return false;
    }

    public static boolean recursiveSearch(ListNode head,int key){

       
            if(head == null){
                return false;
            }
            if(key == head.val){
                return true;
            }
            return recursiveSearch(head.next, key);
            
        
        
    }


    public static ListNode rev(ListNode head){
         
        ListNode q = null;
        ListNode p = head;
       
       
        

        while(p!=null){
            ListNode tmp = p.next;
            p.next = q;
            q = p;
            p = tmp;
           
            
        }
        return q;   
        
    }


    public static ListNode addOne(ListNode head) {

        ListNode tmp = head;
        String sum = "";
        int count = 0;

        while(tmp!=null){
            count++;
            sum+=tmp.val;
            tmp = tmp.next;
        }
        int num = Integer.parseInt(sum);
        int finalNum = num+1;

        ListNode prev = null;
        
        while(finalNum!=0){
            int v = finalNum%10;
            
            ListNode tmp1 = new ListNode(v);
            tmp1.next = prev;
            prev = tmp1;
            finalNum = finalNum/10;

        }
        return prev;

    }


    public static ListNode addOneOptimal(ListNode head) {

       head = reverseListOptimal(head);

       ListNode curr = head;
       int carry = 1;
       while(curr !=null){
         int sum = curr.val+carry;
         carry = sum/10;
         curr.val = sum%10;

         if(curr.next ==null && carry>0){
            curr.next = new ListNode(carry);
            carry = 0;
            
         }
         curr = curr.next;
       }
       head = reverseListOptimal(head);
       return head;
    }


    public static ListNode middleOfLinkedList(ListNode head) {

        ListNode tmp = head;;
        int count = 0;
        while(tmp!=null){
            count++;
            tmp = tmp.next;
        }
        int mid = count/2;
        System.out.println(mid+"mid: ");
        
        tmp = head;
        for(int i=0;i<mid;i++){
            tmp = tmp.next;
        }
        // tmp.next = null;

        return tmp;

    }

    public ListNode deleteMiddle(ListNode head) {

        // if head is null or if there is only one node 
        if(head==null || head.next == null){
            return null;
        }

        ListNode tmp = head;;
        int count = 0;
        while(tmp!=null){
            count++;
            tmp = tmp.next;
        }
        int mid = count/2;
        
        ListNode tail = null;
        tmp = head;
        for(int i=0;i<mid;i++){
            tail = tmp;
            tmp = tmp.next;
        }
        
        tail.next = tmp.next;
        return head;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = 0;
        ListNode tmp = new ListNode(-1);
        ListNode head = tmp;

        while(l1 != null && l2 != null){

            sum = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
            carry = sum%10;

            if(l1!=null && l2!=null && carry>0){
                sum /=10;
                carry --;
            }
            ListNode l3 = new ListNode(sum);
            tmp.next = l3;
            tmp = l3;



        }
        return head.next;
        
    }

    public static void main(String[] args) {

        ListNode y1 = new ListNode(1);
        ListNode y2 = new ListNode(2);
        ListNode y3 = new ListNode(3);
        ListNode y4 = new ListNode(4);
        ListNode y5 = new ListNode(5);

        // Linking the nodes
        y1.next = y2;
        y2.next = y3;
        y3.next = y4;
        y4.next = y5;

        // List<Integer> result = deleteHead(y1);

        // System.out.println("Linked List Values:");
        // for (int val : result) {
        // System.out.print(val + " ");
        // }
        // System.out.println();
        // System.out.println(sortList(y1));

        // LinkedList ll = new LinkedList(); 

        // ListNode newHead = ll.deleteKthNode(y1, 2); 

        // System.out.println("Linked List after deleting head:");
       
        // while (newHead != null) {
        //     System.out.print(newHead.val + " ");
        //     newHead = newHead.next;
        // }
        // System.out.println();

        // sum(y1);
        // System.out.println(recursiveSearch(y1,5));

        // printLinkList(y1);
        // y1 = rev(y1);
        // printLinkList(y1);
        // System.out.print("Original List: ");
        // printLinkList(y1);

        // ListNode head = addOneOptimal(y1);
        // System.out.print("Modified List: ");
        // printLinkList(head);

        ListNode  head = middleOfLinkedList(y1);
        printLinkList(head);
    }

}
