package LeetCode.LC;

public class Lc21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode res = MergeTwoSort(l1,l2);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode MergeTwoSort(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode pre = res;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                res.next = l1;
                l1 = l1.next;
                res = res.next;
            }else{
                res.next = l2;
                l2 = l2.next;
                res = res.next;
            }
        }

        if(l1==null){
            res.next = l2;
        }
        if(l2==null){
            res.next = l1;
        }
        return pre.next;
    }
}
