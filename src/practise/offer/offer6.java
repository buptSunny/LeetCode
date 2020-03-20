package practise.offer;

import practise.Node;

import java.util.Stack;

public class offer6 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        reversePrintNode(node1);
    }

    private static void reversePrintNode(Node node1) {
        if(node1==null){
            return;
        }
        Stack<Node> stack = new Stack<>();

        while(node1!=null){
            stack.push(node1);
            node1 = node1.next;
        }

        while(!stack.isEmpty()){
            Node pop = stack.pop();
            System.out.println(pop.data);
        }
    }
}
