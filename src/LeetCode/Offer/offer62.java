package LeetCode.Offer;

public class offer62 {
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n0;
        int m =3;
        int res = Josephuse(n0,m);
        System.out.println(res);
    }

    private static int Josephuse(Node n0, int m) {
        Node pre = n0;
        int count = m;
        while(n0.next.next !=n0){
            while(m>1){
                pre = n0;
                n0 = n0.next;
                m--;
            }
            /* 删除节点 n0;
             */
            pre.next = n0.next;
            n0 = pre.next;
            m = count;
        }

        if(m%2==1){
            return n0.next.data;
        }else{
            return n0.data;
        }
    }
}
