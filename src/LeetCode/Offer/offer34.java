package LeetCode.Offer;

import java.util.ArrayList;

public class offer34 {
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

        int target = 8;
        ArrayList<Integer> arrays = new ArrayList<>();
        sumEqualsroad(h1,8,arrays);
    }
    /*
        要打印所有的路径则在方法中增加一个arr2，存储每次路径
     */
    private static void sumEqualsroad(TreeNode h1, int i, ArrayList<Integer> arrays) {
        if(h1.left==null&&h1.right==null&&h1.value!=i){
            return;
        }
        if(h1.left==null&&h1.right==null&&h1.value==i){
            arrays.add(h1.value);
            System.out.println(arrays.toString());
            return;
        }
        int target = i-h1.value;
        arrays.add(h1.value);
        sumEqualsroad(h1.left,target, arrays);
        sumEqualsroad(h1.right,target, arrays);
        arrays.remove(arrays.size()-1);

    }
}
