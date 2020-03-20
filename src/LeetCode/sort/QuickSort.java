package LeetCode.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,4,9,6,5};
        quickSortSort(array,0,array.length-1);
        for(int i:array){
            System.out.println(i);
        }
    }
    public static void quickSortSort(int[] array,int low ,int high){
        /*
            设定一个基准，两个哨兵i,j 使得最后基准左边都小于基准，基准右边的都大于基准
         */
        if(low>high){
            return ;
        }
        int i = low;
        int j = high;

        int pivot = i;
        int p = array[pivot];
        while(i<j){
            while(array[j]>=p&&i<j){
                j--;
            }
            while(array[i]<=p&&i<j){
                i++;
            }
            if(i<j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[pivot] = array[i];
        array[i] = p;
        /*
            这里传参是每个小分区的左右区间。
         */
        quickSortSort(array,low,i-1);
        quickSortSort(array,j+1,high);
    }
}
