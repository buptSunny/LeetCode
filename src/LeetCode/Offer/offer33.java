package LeetCode.Offer;

import java.util.Arrays;

public class offer33 {
    public static void main(String[] args) {
        int[] arrays = {5, 7, 6, 9, 11, 10, 8};
        int[] array = {7,4,6,5};
        Boolean res = IsBinaryTree(array);
        System.out.println(res);
    }

    private static Boolean IsBinaryTree(int[] arrays) {
        /*
            二叉搜索树，左子树都比root值小，右子树都比root值大
         */
        if (arrays == null) {
            return true;
        }
        int root = arrays[arrays.length - 1];
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > root) {
                index = i;
                break;
            }
        }
        int[] left = null;
        int[] right = null;
        if (index > 0) {
            left = Arrays.copyOfRange(arrays, 0, index);
        }
        if (index < arrays.length - 1) {
            right = Arrays.copyOfRange(arrays, index, arrays.length - 1);
            for (int nums : right) {
                if (nums < root) {
                    return false;
                }
            }
        }
        return IsBinaryTree(left) && IsBinaryTree(right);
    }
}
