package LeetCode.Offer;

public class offer24 {
    public static void main(String[] args) {

        Node pre = new Node(-1);
        Node Head = new Node(0);
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(3);
        Node h4 = new Node(4);
        Node h5 = new Node(5);
        Node h6 = new Node(6);
        pre.next = Head;
        Head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = null;

        Node res = reverseListNode(Head);
        }



    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        if(head==null){
            return head;
        }
        ListNode curN = head.next;
        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = curN;
            if(curN!=null){
                curN = curN.next;
            }
        }
        return pre;
    }


    private static Node reverseListNode(Node head) {
        return head;
    }
}
