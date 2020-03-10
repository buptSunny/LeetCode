package LeetCode.Offer;

public class offer25 {
    public static void main(String[] args) {
        Node h1 = new Node(1);
        Node h2 = new Node(2);
        Node h3 = new Node(3);
        Node h4 = new Node(4);
        Node h5 = new Node(5);
        Node h6 = new Node(6);
        h1.next = h3;
        h2.next = h4;
        h3.next = h5;
        h4.next = h6;
        h5.next = null;
        h6.next = null;
        Node res = MergeTwoListNode(h1,h2);
        while(res!=null){
            System.out.println(res.data);
            res = res.next;
        }
    }

    private static Node MergeTwoListNode(Node h1, Node h2) {
        if(h1==null){
            return h2;
        }
        else if(h2==null){
            return h1;
        }
        else if(h1==null&&h2==null){
            return h1;
        }
        else{
            Node p = new Node(0);
            Node head = p;
            while(h1!=null&&h2!=null){
                if(h1.data<h2.data){
                    p.next = h1;
                    h1 = h1.next;
                    p = p.next;
                }
                else{
                    p.next = h2;
                    h2 = h2.next;
                    p = p.next;
                }
            }
            if(h1==null){
                p.next = h2;
            }
            else if(h2==null){
                p.next = h1;
            }
            return head.next;
        }




    }
}
