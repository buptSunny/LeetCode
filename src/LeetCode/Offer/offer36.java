package LeetCode.Offer;

public class offer36 {
    static TreeNode head = null;
    static TreeNode end = null;
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
        TreeNode res = Convert(h1);
        while(res!=null){
            res = res.left;
        }
        while(res!=null){
            res = res.right;
            if(res!=null){
            System.out.println(res.value);
            }
        }


    }
    private static TreeNode Convert(TreeNode h1) {
        ConvertSub(h1);
        return head;
    }
    /*
        实际上类似于中序遍历二叉树，只不过二叉树是打印节点，而此处是让该节点与前一个节点连接形成双向链表。
     */
    private static void ConvertSub(TreeNode h1) {
        if(h1==null){
            return ;
        }
        ConvertSub(h1.left);
        if(end==null){
            head = h1;
        }else{
            end.right = h1;
            h1.left = end;
            System.out.println(end.value);
        }
        end = h1;
        ConvertSub(h1.right);
    }
}
