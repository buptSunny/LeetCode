package LeetCode.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,4,3,9,6,5};
        int[] res = bubbleSort(array);
        int[] resShell = ShellSort(array);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(resShell));
    }

    private static int[] ShellSort(int[] array) {
        for(int incre = array.length/2; incre>0; incre = incre/2){
            // 增量从5/2/1 ; 可以把增量变成2^k-1
            for(int i = incre;i<array.length;i++){
                for(int j = i-incre;j>0;j = j- incre){
                    if(array[j]>array[j+incre]){
                        swap(array,j,j+incre);
                    }
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        if(array.length == 0){
            return null;
        }

        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }



    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
