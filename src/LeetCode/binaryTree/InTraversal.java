package LeetCode.binaryTree;

import java.util.Stack;

class TreeNode//节点结构
{
    int value;
    LeetCode.Offer.TreeNode left;
    LeetCode.Offer.TreeNode right;

    TreeNode(int value)
    {
        this.value = value;
    }
}


public class InTraversal {
    public static void main(String[] args) {
        LeetCode.Offer.TreeNode[] node = new LeetCode.Offer.TreeNode[10];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 10; i++) {
            node[i] = new LeetCode.Offer.TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 10)
                node[i].right = node[i * 2 + 2];
        }
        traversal(node[0]);
    }


    // 中序遍历，左根右
    private static void traversal(LeetCode.Offer.TreeNode node){
        if(node.left != null){
            traversal(node.left);
        }
        System.out.println(node.value);
        if(node.right != null){
            traversal(node.right);
        }
    }

    private static void traversal_by_stack(LeetCode.Offer.TreeNode node){
        Stack<LeetCode.Offer.TreeNode> stack = new Stack();
        while(!stack.isEmpty()||node !=null ){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            if(!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.value);
                node = node.right;
            }

        }




    }

}
