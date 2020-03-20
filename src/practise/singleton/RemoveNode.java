package practise.singleton;

import practise.Node;

public class RemoveNode {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        RemoveNodeFunc(node1,2);

        while(node1!=null){
            System.out.println(node1.data);
            node1 = node1.next;
        }

    }

    private static void RemoveNodeFunc(Node node1, int i) {
        if(node1==null){
            return;
        }
        Node p = node1;
        Node pre = new Node(-1);
        pre.next = p;
        while(p!=null){
            if(p.data == i){
                pre.next = p.next;
                break;
            }
            else{
                pre = pre.next;
                p = p.next;
            }
        }
    }

}
