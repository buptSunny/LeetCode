package LeetCode.Offer;

/*
    重建二叉树
        先序 根左右
        中序 左根右
        递归构建
 */
public class offer8 {
    public static void main(String[] args) {
        int preorder[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int inorder[] = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = rebuildBinaryTree(preorder, inorder);
        System.out.println(treeNode);
    }

    public static TreeNode rebuildBinaryTree(int[] preorder, int[] inorder) {
        TreeNode root = coreRebuild(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    public static TreeNode coreRebuild(int[] preorder, int p0, int p1, int[] inorder, int i0, int i1) {
        TreeNode root = new TreeNode(p0);
        if (i0 > i1 || p0 > p1) {
            return null;
        }
        for (int i = i0; i <= i1; i++) {
            if (inorder[i] == preorder[p0]) {
                root.left = coreRebuild(preorder, p0 + 1, i - i0 + p0, inorder, i0, i - 1);
                root.right = coreRebuild(preorder, i - i0 + p0 + 1, p1, inorder, i + 1, i1);
            }
        }
        return root;
    }
}
