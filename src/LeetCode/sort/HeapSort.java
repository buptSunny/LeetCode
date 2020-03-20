package LeetCode.sort;

import java.util.Arrays;

import static LeetCode.sort.QuickSortByStack.swap;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 2, 4, 9, 6, 5};
        heapSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array, int left, int right) {
        /*
            1. 使得数组成为堆的形式；（构建最大堆）
            array[i] > array[2*i+1]
            array[i] > array[2*i+2]
            2，将堆首与末尾元素互换；互换后最后一个数字就是最大值，有序；
            3. 重新构建最大堆，继续与倒数第二个互换。。。直到完成。
         */
        for (int i = 0; i < array.length; i++) {
            // 从最后一个非叶子节点从左到右，从下到上调整结构
            createHeap(array, 0,array.length - i - 1);
            // 将堆顶元素与末尾元素交换位置
            swap(array, 0, array.length - i - 1);
        }


    }

    private static void createHeap(int[] array, int left, int right) {
        /*
         构建最大堆:
            从最后一个非叶子节点开始构建。
            因为a[i] > a[2i+1]
            最后一个非叶子节点未 2i+1 = lenth
            i = (lenth - 1)/2
         */
        for (int i = (right - 1)/2; i >= 0; i--) {
            if ((right - 1) / 2 != i) {
                if(array[right]>array[i]){
                    swap(array,right,i);
                }
            } else {
                int maxIndex = threeMax(array,i,right-1,right);
                swap(array,maxIndex,i);
            }
        }


    }

    private static int threeMax(int[] array, int i, int i1, int right) {
        return 1;
    }
}
