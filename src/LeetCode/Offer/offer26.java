package LeetCode.Offer;

import java.util.Stack;

public class offer26{
    public static void main(String[] args) {
        TreeNode h1 = new TreeNode(8);
        TreeNode h2 = new TreeNode(8);
        TreeNode h3 = new TreeNode(7);
        TreeNode h4 = new TreeNode(9);
        TreeNode h5 = new TreeNode(2);
        TreeNode h6 = new TreeNode(4);
        TreeNode h7 = new TreeNode(7);

        TreeNode T1 = new TreeNode(8);
        TreeNode T2 = new TreeNode(9);
        TreeNode T3 = new TreeNode(2);

        T1.left = T2;
        T1.right = T3;

        h1.left = h2;
        h1.right = h3;
        h2.left = h4;
        h2.right = h5;
        h5.left = h6;
        h5.right = h7;
        Boolean res = IsSameTrue(h2,T1);
        System.out.println(res);
    }

    private static Boolean IsChildTree(TreeNode h1, TreeNode t1) {
        /*
            遍历每个节点判断是否与t1节点相同
         */
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty()||h1!=null){
            while(h1!=null){
                if(IsSameTrue(h1,t1)){
                    return true;
                }
                s.push(h1);
                h1 = h1.left;
            }
            if(!s.isEmpty()){
                h1 = s.pop();
                h1 = h1.right;
                if(IsSameTrue(h1,t1)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean IsSameTrue(TreeNode h1, TreeNode t1) {
        if(t1==null){
            return true;
        }
        if(h1==null){
            return false;
        }
        if(h1.value!=t1.value){
            return false;
        }
        else{
            return IsSameTrue(h1.left,t1.left)&&IsSameTrue(h1.right,t1.right);
        }
    }


}
