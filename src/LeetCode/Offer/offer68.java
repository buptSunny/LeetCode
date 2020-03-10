package LeetCode.Offer;

import java.util.ArrayList;
import java.util.Collections;

public class offer68 {

    static  ArrayList road1 = new ArrayList();
    static  ArrayList list2 = new ArrayList();
    static  ArrayList road2 = new ArrayList();
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

        TreeNode target1 = h5;
        TreeNode target2 = h6;
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        findNode(h1,target1,list1);
        list1 = road1;
        road1 = road2;
        findNode(h1,target2,list2);
        list2 = road1;
        System.out.println(list1);
        System.out.println(list2);
        /*
            接着找到list1和list2的公共子节点；
         */

    }

    private static void findNode(TreeNode h1, TreeNode target1,ArrayList list1) {
        if(h1==target1){
            list1.add(target1);
            road1.addAll(list1);
            return;
        }
        if(h1==null){
            return;
        }
        list1.add(h1);
        findNode(h1.left,target1,list1);
        findNode(h1.right,target1,list1);
        list1.remove(list1.size()-1);
    }
}
