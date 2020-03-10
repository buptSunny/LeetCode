package LeetCode.LC;

        import java.util.List;

public class Lc61 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            ListNode pre = new ListNode(0);
            ListNode t = head;
            int count = 0;
            while(t!=null){
                t = t.next;
                count++;
            }
            if(count==0||k==0){
                return head;
            }
            k = k%count;

            pre.next = head;
            ListNode fast = head;
            ListNode slow = head;
            while(k>0){
                fast = fast.next;
                k--;
            }
            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }
            ListNode last = slow;
            ListNode first = slow.next;
            if(first==null){
                return head;
            }
            last.next = null;
            pre.next = first;
            while(first!=null&&first.next!=null){
                first = first.next;
            }
            first.next = head;
            return pre.next;
        }
    }
}
