package LeetCode.Offer;
/*
    二叉树遍历：
        先序：根左右
        中序：左根右
        后序：左右根
        层次：从上至下
 */
public class offer7 {
    public static void main(String[] args) {
        solution1 s = new solution1();
        int pre[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int in[] = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = solution1.reConstructBinaryTree(pre,in);
        System.out.println(root);

    }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
