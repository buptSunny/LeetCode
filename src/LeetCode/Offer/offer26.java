package LeetCode.Offer;

import java.util.Stack;

public class offer26{
    public static void main(String[] args) {
        TreeNode h1 = new TreeNode(8);

        TreeNode T1 = new TreeNode(8);



        Boolean res = IsSameTrue(h1,T1);
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
