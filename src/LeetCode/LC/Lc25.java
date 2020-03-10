package LeetCode.LC;
/*
    未完成
 */
public class Lc25 {
    public static void main(String[] args) {
        //"1->2->3->4->5"
        int k = 3;
        //3个一组 翻转链表；
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode start = l1;
        ListNode end = l1;
        //ListNode res = ReverseKList(l1,k);

    }
}
