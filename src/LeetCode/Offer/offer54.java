package LeetCode.Offer;

import LeetCode.binaryTree.InTraversal;

public class offer54 {
    static int count = 0;
    static int k = 3;
    static TreeNode res = new TreeNode(-1);
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

        KInTraversal(h1);
        System.out.println(res.value);
    }

    private static void KInTraversal(TreeNode h1) {
        if(h1==null){
            return;
        }
        KInTraversal(h1.left);
        System.out.println("root = "+String.valueOf(h1.value));
        count++;
        if(count==k){
            res=h1;
        }
        System.out.println("count = "+String.valueOf(count));
        KInTraversal(h1.right);

    }
}
