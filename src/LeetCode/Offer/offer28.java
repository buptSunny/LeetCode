package LeetCode.Offer;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class offer28 {
    public static void main(String[] args) {
        TreeNode h1 = new TreeNode(1);
        TreeNode h2 = new TreeNode(2);
        TreeNode h3 = new TreeNode(2);
        TreeNode h4 = new TreeNode(4);
        TreeNode h5 = new TreeNode(5);
        TreeNode h6 = new TreeNode(5);
        TreeNode h7 = new TreeNode(4);

        h1.left = h2;
        h1.right = h3;
        h2.left = h4;
        h2.right = h5;
        h3.left = h6;
        h3.right = h7;
        TreeNode p = h1;
        Boolean res = IsMirrorTree(h1);
        System.out.println(res);
    }

    private static Boolean IsMirrorTree(TreeNode h1) {
        /*
            根左右和根右左的一样，则为对称二叉树
         */
        ArrayList<TreeNode> l1 = RootLeftRight(h1);
        ArrayList<TreeNode> l2 = RootRightLeft(h1);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        if(l1.equals(l2)){
            return true;
        }
        else{
            return false;
        }

    }

    private static ArrayList<TreeNode> RootRightLeft(TreeNode h1) {
        ArrayList<TreeNode> l1 = new ArrayList<>();
        Stack<TreeNode> s = new Stack();
        while (!s.empty() || h1 != null) {
            while (h1 != null) {
                l1.add(h1);
                s.push(h1);
                h1 = h1.right;
            }
            if (!s.empty()) {
                h1 = s.pop();
                h1 = h1.left;
            }
        }
        return l1;
    }
    private static ArrayList<TreeNode> RootLeftRight(TreeNode h1) {
        ArrayList<TreeNode>l1 = new ArrayList<>();
        Stack<TreeNode> s = new Stack();
        while(!s.empty()||h1!=null){
            while(h1!=null){
                l1.add(h1);
                s.push(h1);
                h1 = h1.left;
            }
            if(!s.empty()){
                h1 = s.pop();
                h1 = h1.right;
            }
        }
        return l1;

    }
}
