package LeetCode.sort;

import java.util.Arrays;
import java.util.Stack;


/**
 * 快速排序的原理：
 选择一个关键值作为基准值。比基准值小的都在左边序列（一般是无序的），比基准值大的都在右边（一般是无序的）。一般选择序列的第一个元素。
 一次循环：从后往前比较，用基准值和最后一个值比较，如果比基准值小的交换位置，如果没有继续比较下一个，直到找到第一个比基准值小的值才交换。
 找到这个值之后，又从前往后开始比较，如果有比基准值大的，交换位置，如果没有继续比较下一个，直到找到第一个比基准值大的值才交换。
 直到从前往后的比较索引>从后往前比较的索引，结束第一次循环，此时，对于基准值来说，左右两边就是有序的了。
 接着分别比较左右两边的序列，重复上述的循环。
 */
public class FastSort{

    public static void main(String []args){
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
//        sort(a,start,end);
        //非递归 栈实现
        quickSort(a);
        System.out.println(Arrays.toString(a));

    }

    private static void quickSort(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }
        //存放开始于结束索引
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(array.length - 1);
        //循环读取栈中的开始结束位置
        while (!stack.isEmpty()) {
            int right = stack.pop();
            int left = stack.pop();
            //右边界索引小于左边界索引说明结束了
            if (left >= right) {
                continue;
            }
            int i = partition(array, left, right);
            if (left < i - 1) {
                stack.push(left);
                stack.push(i -  1);
            }
            if (i + 1 < right) {
                stack.push(i + 1);
                stack.push(right);
            }
        }
    }

    public static int partition(int[] array, int left, int right) {

        int threshold = array[left];

        while (left < right) {
            while (left < right && array[right] >= threshold) {
                right--;
            }

            array[left] = array[right];

            while (left < right && array[left] <= threshold) {
                left++;
            }
            array[right] = array[left];

        }
        array[left] = threshold;
        return left;

    }


}