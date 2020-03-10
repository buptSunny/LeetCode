package LeetCode.sort;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,4,3,9,6,5};
        int[] temp = new int[array.length];
        mergeSort(array,temp,0,array.length-1);
        for(int i:array){
            System.out.println(i);
        }
    }
    private static void mergeSort(int[] nums, int[] temp, int left, int right) {

        if(left < right) {
            //从中间将数组分成两半
            int mid = (left + right) >> 1;
            mergeSort(nums, temp, left, mid);
            mergeSort(nums, temp, mid+1, right);
            //将两个数组重新合并
            merge(nums, temp, left, mid+1, right);
        }
    }
    private static void merge(int[] nums, int[] temp,
                              int leftPos, int rightPos, int rightEnd) {

        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        //对比左右两个数组并将较小的数先放到辅助数组
        while(leftPos <= leftEnd && rightPos <= rightEnd) {
            if(nums[leftPos] <= nums[rightPos]) {
                temp[tmpPos++] = nums[leftPos++];
            }else {
                temp[tmpPos++] = nums[rightPos++];
            }
        }
        //把左边数组剩下的原数放到辅助数组
        while(leftPos <= leftEnd) {
            temp[tmpPos++] = nums[leftPos++];
        }
        //把右边数组剩下的原数放到辅助数组
        while(rightPos <= rightEnd) {
            temp[tmpPos++] = nums[rightPos++];
        }
        //把辅助数组复制到原数组
        for(int i = 0; i < numElements; i++,rightEnd--) {
            nums[rightEnd] = temp[rightEnd];
    }
    }
}
