package LeetCode.Offer;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

public class offer37 {
    static int index = -1;
    static TreeNode root = null;
    public static void main(String[] args) {
        TreeNode h1 = new TreeNode(1);
        TreeNode h2 = new TreeNode(2);
        TreeNode h3 = new TreeNode(3);
        TreeNode h4 = new TreeNode(4);
        TreeNode h5 = null;
        TreeNode h6 = new TreeNode(6);
        TreeNode h7 = new TreeNode(7);

        h1.left = h2;
        h1.right = h3;
        h2.left = h4;
        h2.right = h5;
        h3.left = h6;
        h3.right = h7;
        String[]arrays = {"1","2","4","$","$","$","3","6","$","$","7","$","$"};
        LinkedList<String> queqe = new LinkedList();
        for(String i : arrays){
            queqe.offer(i);
        }
        //SerializedBinaryTree(h1);
        TreeNode res = null;
        Deserialize2(arrays);
        //SerializedBinaryTree(res);


    }
    /*
        反序列化，等与$时，返回，否则就填左边；返回后的填右边；
     */

    static TreeNode Deserialize2(String[] strs) {
        index++;
        if(!strs[index].equals("$")) {
            TreeNode root = new TreeNode(0);
            //System.out.println(root.value);
            root.value = Integer.parseInt(strs[index]);
            System.out.println(root.value);
            root.left = Deserialize2(strs);
            root.right = Deserialize2(strs);
            return root;
        }
        return null;
    }



    private static void SerializedBinaryTree(TreeNode h1) {
        if(h1==null){
            System.out.println("$");
            return;
        }
        System.out.println(h1.value);
        SerializedBinaryTree(h1.left);
        SerializedBinaryTree(h1.right);
    }
}
