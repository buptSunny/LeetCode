package LeetCode.Offer;


public class offer18_ListNode {
    public static void main(String[] args) {
        Node Head = new Node(0);
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(3);
        Node h6 = new Node(3);
        Node h4 = new Node(3);
        Node h5 = new Node(5);
        Head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h6;
        h6.next = h4;
        h4.next = h5;
        h5.next = null;
        Node target = h3;
        /*
        delete(Head,target);
         */
        deleteduplication(Head);
        while(Head != null){
            System.out.println(Head.data);
            Head = Head.next;
        }
    }
    /*
        删除排序链表的重复节点
     */
    private static void deleteduplication(Node head) {
        while(head.next!=null){
            while(head.next!=null&&head.data == head.next.data){
                head.next = head.next.next;
            }
            head = head.next;
        }
    }

    /*
        删除链表中的节点，从头到尾遍历 O(n)
        直接找到该节点，让next节点的值赋予到该节点，并删除next节点。O(1)
     */
    private static Node delete(Node head,int target) {
        Node pre = new Node(-1);
        Node res = pre;
        pre.next = head;
        while(head!=null){
            if(head.data!=target){
                pre = pre.next;
                head = head.next;
            }else{
                pre.next = head.next;
                break;
            }
        }

        return res.next;
    }
}
