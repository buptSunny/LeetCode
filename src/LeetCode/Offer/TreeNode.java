package LeetCode.Offer;

import java.util.Objects;

public class TreeNode {
    //数据域
    public int value;
    //左指针域
    public TreeNode left = null;
    //右指针域
    public TreeNode right = null;

    //构造带有参数的构造方法
    public TreeNode(int value) {
        this.value = value;
    }

    public String toString() {
        return "TreeNode [data=" + value + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode treeNode = (TreeNode) o;
        return value == treeNode.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }
}