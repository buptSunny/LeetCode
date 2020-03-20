package LeetCode.Offer;


public class solution1 {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int start = 0;
        int end = pre.length-1;
        return generateBinaryTree(pre,in,start,end,start,end);
    }

    public static TreeNode generateBinaryTree(int[] pre,int []in,int start,int end,int left, int right){


        if(start > end || left > right){
            return null;
        }
        TreeNode root = new TreeNode(pre[start]);
        int rootIndex = 0;
        for(int i = 0; i < in.length;i++){
            if(in[i]==pre[start]){
                rootIndex = i;
                break;
            }
        }
        root.left = generateBinaryTree(pre,in,start+1,start+rootIndex-left,left,rootIndex-1);
        root.right = generateBinaryTree(pre,in,start+rootIndex-left+1,end,rootIndex+1,right);
        return root;
    }
}