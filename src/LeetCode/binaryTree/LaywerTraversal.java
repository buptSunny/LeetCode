package LeetCode.binaryTree;
import LeetCode.Offer.TreeNode;

import java.util.LinkedList;

public class LaywerTraversal {
    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 10; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 10)
                node[i].right = node[i * 2 + 2];
        }
        traversal(node[0]);
    }

    private static void traversal(TreeNode node){
        if(node == null){
            System.out.println("none");
        }
        LinkedList<TreeNode> queqe = new LinkedList<>();
        queqe.offer(node);
        while(!queqe.isEmpty()){
            node = queqe.poll();
            System.out.println(node.value);
            if(node.left!=null){
                queqe.offer(node.left);
        }
            if(node.right!=null){
                queqe.offer(node.right);
            }
        }
    }
}
