package LeetCode.Offer;
/*
    链表的倒数第k个节点
 */

public class offer22 {
    public static void main(String[] args) {
        Node Head = new Node(0);
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(3);
        Node h4 = new Node(4);
        Node h5 = new Node(5);
        Head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = null;
        int k = 3;
        Node res = ReverseKNode(Head, k);
        System.out.println(res.data);
    }
    public static Node ReverseKNode(Node head,int k){
        Node first = head;
        Node last = head;
        if(head==null||k==0){
            return null;
        }
        while(k>0&&first!=null){
            first= first.next;
            k--;
        }
        if(first==null&&k==0){
            return last;
        }
        else if(first==null&&k!=0){
            return null;
        }
        while(first!=null){
            last = last.next;
            first = first.next;
        }
        return last;
    }
}
