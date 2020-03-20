package LeetCode.binaryTree;
/*
    根左右；递归
 */


import LeetCode.Offer.TreeNode;

import java.util.Stack;


public class PreTraversal {
    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)
                node[i].left = node[i*2+1];
            if(i*2+2 < 10)
                node[i].right = node[i*2+2];
        }
        traversal(node[0]);
    }
    /*
        psvm 是静态方法，不能调用其他非静态方法。递归实现
     */
     private static void traversal(TreeNode root){
        System.out.println(root.value);
        if(root.left != null){
            traversal(root.left);
        }
        if(root.right != null){
            traversal(root.right);
        }
    }
    /*
        栈实现
     */
    private static void traversakByStack(TreeNode root){
        /*
            栈不为空时，继续循环
            将根节点入栈，如果左节点不为空，则左节点一直进栈。不存在时，根节点出栈，并将出栈后的节点的右节点赋值给p；
         */
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        TreeNode p = root;
        while(p!=null || !stack.isEmpty())
        {
            //当前节点不为空。访问并压入栈中。并将当前节点赋值为左儿子
            if (p!=null)
            {
                stack.push(p);
                System.out.print(p.value);
                p=p.left;
            }
            else
            {
                p=stack.pop();
                p=p.right;
            }
        }
    }

    public static void traversalBystack_pre(TreeNode root){
        Stack<TreeNode> s = new Stack();
        while(!s.isEmpty()&&root!=null){
            while(root!=null){
                s.add(root);
                System.out.println(root.value);
                root = root.left;
            }
            if(!s.isEmpty()){
                root = s.pop();
                root = root.right;
            }
        }
    }

    public static void traversalBystack_inorder(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty()||root!=null){
            while(root!=null){
                s.add(root);
                root = root.left;
            }
            if(!s.isEmpty()){
                root = s.pop();
                System.out.println(root.value);
                root = root.right;
            }
        }
    }

}

