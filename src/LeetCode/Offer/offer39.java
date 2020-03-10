package LeetCode.Offer;

import LeetCode.sort.QuickSort;

public class offer39 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,2,2,2,5,4,2,2,3};
        //int res = OverHalfOfArrays(arrays);
        int res1 = QuickSortMoreThanHalf(arrays);
        //System.out.println(res);
        System.out.println(res1);
    }

    private static int QuickSortMoreThanHalf(int[] arrays) {
        int start = 0;
        int end = arrays.length-1;
        int index = QuickSortIndex(arrays,start,end);
        while(index!=arrays.length/2){
            if(index<arrays.length/2){
                index = QuickSortIndex(arrays,index+1,end);
            }
            else{
                index = QuickSortIndex(arrays,start,index-1);
            }
        }
        return arrays[index];
    }

    private static int QuickSortIndex(int[] arrays, int start, int end) {
        int pivot = arrays[start]; //快排基准
        int i = start;
        while(start < end){
            while(arrays[start]<=pivot &&start<end){
                start++;
            }
            while(arrays[end]>pivot&&start<end){
                end--;
            }
            swap(arrays,start,end);
        }
        swap(arrays,start,end);
        swap(arrays,i,end);
        return end;
    }

    private static int OverHalfOfArrays(int[] arrays) {
        int count = 1;
        int nums = arrays[0];
        for(int i=1;i<arrays.length;i++){
            if(arrays[i]==nums){
                count++;
            }
            else{
                count--;
                if(count<=0){
                    nums = arrays[i];
                    count = 1;
                }
            }
        }
            return nums;
    }

    public static int[] swap(int[] ints, int x, int y) {
        int temp = ints[x];
        ints[x] = ints[y];
        ints[y] = temp;
        return ints;
    }
}
