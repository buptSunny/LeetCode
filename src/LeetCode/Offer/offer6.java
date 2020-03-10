package LeetCode.Offer;

import java.util.ArrayList;

import java.util.Stack;

public class offer6  {
    public static void  main(String[] args){
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        for(int i:printListFromTailToHead(l1)){
            System.out.print(i+ " ");
        }

    }
    //选择ArrayList是因为查询效率高
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}