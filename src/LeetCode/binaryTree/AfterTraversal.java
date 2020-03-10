package LeetCode.binaryTree;

import LeetCode.Offer.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class AfterTraversal {
    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 10; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 10)
                node[i].right = node[i * 2 + 2];
        }
        traversal(node[0]);
    }
    /*
        递归实现
        后序遍历：左右根
     */
    private static void traversal(TreeNode node){
        if(node.left != null){
            traversal(node.left);
        }
        if(node.right != null){
            traversal(node.right);
        }
        System.out.println(node.value);
    }
    /*
        先序遍历是根左右，后序遍历是左右根。
        模仿先序的写成根右左，反转得到左右根。
     */
    private static void traversal_by_stack(TreeNode node){
        Stack<TreeNode> stack = new Stack();
        ArrayList list = new ArrayList();
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                list.add(node.value);
                stack.push(node);
                node = node.right;
            }
            if(!stack.isEmpty()) {
                node = stack.pop();
                node = node.left;
            }
        }
        Collections.reverse(list);
        System.out.println(list.toString());
    }
}
