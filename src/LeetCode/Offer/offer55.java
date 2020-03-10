package LeetCode.Offer;

public class offer55 {
    static boolean res = true;
    public static void main(String[] args) {
        /*
            判断是否为平衡二叉树；
            二叉树的题，全是遍历；选择最合适的遍历方式；
            遍历每一个节点，判断其左右子树深度差是否小于等于1
         */

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

        Boolean res = IsAVLTree(h1);
        System.out.println(res);
    }

    private static Boolean IsAVLTree(TreeNode h1) {
        int depth = TreeDepth(h1);
        return res;
    }

   /*
       求depth时，已经用到了左子树和右子树的高度；因此，利用上这个depth，但凡有一个左右子树depth高度差>1，则变量赋值为false；
       return res；
    */
    private static int TreeDepth(TreeNode h1) {
        if(h1==null){
            return 0;
        }
        int depth = 0;
        int left = TreeDepth(h1.left);
        int right = TreeDepth(h1.right);
        if(Math.abs(left-right)<=1){
            depth = Math.max(left,right)+1;
        }
        else{
            res = false;
        }
        return depth;

    }
}
