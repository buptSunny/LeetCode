package LeetCode.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1,3,7,2,4,3,9,6,5};
        int[] res = insertsort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
    public static int[] insertsort(int[] array){
        if(array.length == 0){
            return null;
        }
        /*
            将未排序的数字加入到排序好的数字当中
         */
        for(int i=0;i<array.length-1;i++){
            int preIndex = i;
            int currentIndex = i+1;
            int temp = array[currentIndex];
            while(preIndex >= 0 && array[preIndex] > temp){
                array[preIndex+1] = array[preIndex];
                preIndex --;
            }
            array[preIndex+1] = temp;
        }
        return array;
    }
}
