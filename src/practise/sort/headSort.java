package practise.sort;

import java.util.Arrays;

public class headSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 2, 4, 9, 6, 5};
        heapSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array, int start, int end) {

        /*
        构建堆: 从最后一个节点（非叶子节点）开始，自下向上构建
        注意点： 构建堆时，第一层的节点构成堆之后，需要递归到被交换的节点，继续从上到下递归该被交换的节点。
        */
        for(int i= (int) Math.floor(end/2);i>=0;i--){
            heapify(array,i,end);
        }
        /*i
            将堆顶与j交换。
         */
        for(int j = array.length-1;j>0;j--){
            swap(array,0,j);
            heapify(array,0,j);
        }
    }

    private static void heapify(int[] array, int i, int j) {
        int left = 2*i+1;
        int right = 2*i+2;
        int largeIndex = i;
        if(left<j && array[left]>array[largeIndex]){
            largeIndex = left;
        }

        if(right<j && array[right]>array[largeIndex]){
            largeIndex = right;
        }

        if(largeIndex != i){
            swap(array,i,largeIndex);
            heapify(array,largeIndex,j);
        }

    }

    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
