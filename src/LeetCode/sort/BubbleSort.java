package LeetCode.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,4,3,9,6,5};
        int[] res = bubbleSort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
    public static int[] bubbleSort(int[] array){
        if(array.length == 0){
            return null;
        }

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    swap(array,i,j);
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
