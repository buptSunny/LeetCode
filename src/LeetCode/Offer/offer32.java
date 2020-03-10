package LeetCode.Offer;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

public class offer32 {
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

        lawTraverasl(h1);

    }

    private static void lawTraverasl(TreeNode h1) {
        /*
        层次遍历
         */
        LinkedList<TreeNode> queqe = new LinkedList<>();
        queqe.offer(h1);
        while(!queqe.isEmpty()){
            TreeNode node = queqe.poll();
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
