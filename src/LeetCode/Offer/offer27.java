package LeetCode.Offer;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

public class offer27 {
    public static void main(String[] args) {
        TreeNode h1 = new TreeNode(1);
        TreeNode h2 = new TreeNode(2);
        TreeNode h3 = new TreeNode(3);
        TreeNode h4 = new TreeNode(4);
        TreeNode h5 = new TreeNode(5);
        TreeNode h6 = new TreeNode(6);
        TreeNode h7 = new TreeNode(7);

        h1.left = h2;
        h1.right = h3;
        h2.left = h4;
        h2.right = h5;
        h3.left = h6;
        h3.right = h7;
        TreeNode p = h1;
        TreeNode res = MirrorTree(h1);
        traversal(res);
    }

    private static TreeNode MirrorTree(TreeNode h1) {
        /*
            二叉树镜像
         */
        if(h1==null){
            return h1;
        }
        TreeNode l = h1.left;
        TreeNode r = h1.right;
        h1.left = MirrorTree(h1.right);
        h1.right = MirrorTree(l);
        return h1;
    }


    private static void traversal(TreeNode node) {
        if (node == null) {
            System.out.println("none");
        }
        LinkedList<TreeNode> queqe = new LinkedList<>();
        queqe.offer(node);
        while (!queqe.isEmpty()) {
            node = queqe.poll();
            System.out.println(node.value);
            if (node.left != null) {
                queqe.offer(node.left);
            }
            if (node.right != null) {
                queqe.offer(node.right);
            }
        }
    }
}
