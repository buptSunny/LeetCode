package LeetCode.sort;

import java.util.Arrays;
import java.util.Stack;

import static LeetCode.sort.QuickSort.quickSortSort;

public class QuickSortByStack {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,4,9,6,5};
        quickSortSortByStack(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private static void quickSortSortByStack(int[] array, int left, int right) {
        Stack<Integer> s = new Stack<>();
        s.push(left);
        s.push(right);
        while(!s.isEmpty()){
            right = s.pop();
            left = s.pop();
            if (left >= right) {
                break;
            }
            int i = partition(array,left,right);
            if (left < i - 1) {
                s.push(left);
                s.push(i -  1);
            }
            if (i + 1 < right) {
                s.push(i + 1);
                s.push(right);
            }
        }

    }

    private static int partition(int[] array, int left, int right) {
        int pivot = left;
        int  p = array[pivot];
        while(left<right){
            while(left<right && array[right]>=array[pivot]){
                right --;
            }
            while(left<right && array[left]<=array[pivot]){
                left++;
            }
            if(left<right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        array[pivot] = array[left];
        array[left] = p;
        return left;
    }

    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
