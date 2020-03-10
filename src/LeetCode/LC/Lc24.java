package LeetCode.LC;

public class Lc24 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        ListNode res = swapPairs(l1);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode swapPairs(ListNode l1) {
        ListNode pre = new ListNode(0);
        ListNode res = pre;
        pre.next = l1;
        ListNode left = l1;
        ListNode right = l1.next;
        while(right!=null&&left!=null){
            ListNode rightN = right.next;
            pre.next = right;
            right.next = left;
            left.next = rightN;
            pre = left;
            left = rightN;
            if(rightN!=null){
                right = rightN.next;}
        }
        return res.next;
    }
}
