package LeetCode.Offer;

public class offer23 {
    public static void main(String[] args) {
        Node Head = new Node(0);
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(3);
        Node h4 = new Node(4);
        Node h5 = new Node(5);
        Node h6 = new Node(6);
        Node h7 = h4;
        Head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        h5.next = h6;
        h6.next = h7;
        /*
            first和last，first先比last走环中节点数，first和last相遇时未入口；
            计算环中节点数：进入环中后，循环回到原点。
         */
        Node fisrt = Head;
        Node last = Head;
        Node fast = Head.next.next;
        Node slow = Head.next;
        if(fast==slow){
            System.out.println("This is a circle");
        }
        while(fast!=slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        /*
            现在slow已进入环中
         */
        int count = 1;
        slow = slow.next;
        while(fast!=slow){
            count++;
            slow = slow.next;
        }
        System.out.println(count);
        /*
        first先走count步后last再走，两者相遇时返回节点
         */
        while(count!=0){
            fisrt = fisrt.next;
            count--;
        }
        while(fisrt!=last){
            fisrt = fisrt.next;
            last = last.next;
        }
        System.out.println(last.data);
    }
}
